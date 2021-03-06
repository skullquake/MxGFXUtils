// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package gfxutils.actions;

import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * Status:
 *     In progress
 * 
 * Parameters
 * 
 * int w
 *     img width
 * int h
 *     img height
 * double s
 *     noise scale
 * ParameterType obj_filedocument
 *     file document to populate
 * return:
 *     bool success: true
 *     bool fail: false
 * 
 * * reference:
 *     https://rosettacode.org/wiki/Perlin_noise#Java
 */
public class ja_perlin extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Long w;
	private java.lang.Long h;
	private java.lang.Double s;
	private IMendixObject obj_filedocument;

	public ja_perlin(IContext context, java.lang.Long w, java.lang.Long h, java.lang.Double s, IMendixObject obj_filedocument)
	{
		super(context);
		this.w = w;
		this.h = h;
		this.s = s;
		this.obj_filedocument = obj_filedocument;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		java.lang.Boolean ret=false;
		if(obj_filedocument!=null){
			if(
				w!=null&&w>0
			){
				if(
					h!=null&&h>1
				){
					if(
						s!=null&&s>0
					){
						//create awt
						java.awt.image.BufferedImage bi=new java.awt.image.BufferedImage(
							w.intValue(),
							h.intValue(),
							java.awt.image.BufferedImage.TYPE_INT_RGB
						);
						double daspect=(w/h);
						for(int x=0;x<w.intValue();x++){
							for(int y=0;y<h.intValue();y++){
								double dx=s*((float)x)/w.intValue();
								double dy=s*((float)y)/h.intValue();
								double dz=s*((float)y)/h.intValue();
   								double v=(noise(dx,dy,dy)+1)/2.0;
								int r=(int)Math.floor(v*255);//255;
								int g=(int)Math.floor(v*255);//255;
								int b=(int)Math.floor(v*255);//255;
								int col=(r << 16) | (g << 8) | b;
								bi.setRGB(
									x,
									y,
									col
								);		 
							}
						}
						java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
						byte[] barr = bos.toByteArray();
						javax.imageio.ImageIO.write(bi,"png",bos);
						java.io.ByteArrayInputStream is = new java.io.ByteArrayInputStream(bos.toByteArray());
						com.mendix.core.Core.storeFileDocumentContent(this.getContext(),obj_filedocument,obj_filedocument.getValue(this.getContext(),"Name"),is);
						com.mendix.core.Core.commit(this.getContext(),obj_filedocument);
						ret=true;
						//populate awt
						//populate filedocument
						//set return
					}else{
						com.mendix.core.Core.getLogger(this.toString()).error("invalid scale:Aborting...");
					}

				}else{
					com.mendix.core.Core.getLogger(this.toString()).error("invalid height:Aborting...");
				}
			}else{
				com.mendix.core.Core.getLogger(this.toString()).error("invalid width:Aborting...");
			}
		}else{
			com.mendix.core.Core.getLogger(this.toString()).error("obj_filedocument NULL:Aborting...");
		}
		return ret;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_perlin";
	}

	// BEGIN EXTRA CODE
   static public double noise(double x, double y, double z) {
      int X = (int)Math.floor(x) & 255,                  // FIND UNIT CUBE THAT
          Y = (int)Math.floor(y) & 255,                  // CONTAINS POINT.
          Z = (int)Math.floor(z) & 255;
      x -= Math.floor(x);                                // FIND RELATIVE X,Y,Z
      y -= Math.floor(y);                                // OF POINT IN CUBE.
      z -= Math.floor(z);
      double u = fade(x),                                // COMPUTE FADE CURVES
             v = fade(y),                                // FOR EACH OF X,Y,Z.
             w = fade(z);
      int A = p[X  ]+Y, AA = p[A]+Z, AB = p[A+1]+Z,      // HASH COORDINATES OF
          B = p[X+1]+Y, BA = p[B]+Z, BB = p[B+1]+Z;      // THE 8 CUBE CORNERS,
 
      return lerp(w, lerp(v, lerp(u, grad(p[AA  ], x  , y  , z   ),  // AND ADD
                                     grad(p[BA  ], x-1, y  , z   )), // BLENDED
                             lerp(u, grad(p[AB  ], x  , y-1, z   ),  // RESULTS
                                     grad(p[BB  ], x-1, y-1, z   ))),// FROM  8
                     lerp(v, lerp(u, grad(p[AA+1], x  , y  , z-1 ),  // CORNERS
                                     grad(p[BA+1], x-1, y  , z-1 )), // OF CUBE
                             lerp(u, grad(p[AB+1], x  , y-1, z-1 ),
                                     grad(p[BB+1], x-1, y-1, z-1 ))));
   }
   static double fade(double t) { return t * t * t * (t * (t * 6 - 15) + 10); }
   static double lerp(double t, double a, double b) { return a + t * (b - a); }
   static double grad(int hash, double x, double y, double z) {
      int h = hash & 15;                      // CONVERT LO 4 BITS OF HASH CODE
      double u = h<8 ? x : y,                 // INTO 12 GRADIENT DIRECTIONS.
             v = h<4 ? y : h==12||h==14 ? x : z;
      return ((h&1) == 0 ? u : -u) + ((h&2) == 0 ? v : -v);
   }
   static final int p[] = new int[512], permutation[] = { 151,160,137,91,90,15,
   131,13,201,95,96,53,194,233,7,225,140,36,103,30,69,142,8,99,37,240,21,10,23,
   190, 6,148,247,120,234,75,0,26,197,62,94,252,219,203,117,35,11,32,57,177,33,
   88,237,149,56,87,174,20,125,136,171,168, 68,175,74,165,71,134,139,48,27,166,
   77,146,158,231,83,111,229,122,60,211,133,230,220,105,92,41,55,46,245,40,244,
   102,143,54, 65,25,63,161, 1,216,80,73,209,76,132,187,208, 89,18,169,200,196,
   135,130,116,188,159,86,164,100,109,198,173,186, 3,64,52,217,226,250,124,123,
   5,202,38,147,118,126,255,82,85,212,207,206,59,227,47,16,58,17,182,189,28,42,
   223,183,170,213,119,248,152, 2,44,154,163, 70,221,153,101,155,167, 43,172,9,
   129,22,39,253, 19,98,108,110,79,113,224,232,178,185, 112,104,218,246,97,228,
   251,34,242,193,238,210,144,12,191,179,162,241, 81,51,145,235,249,14,239,107,
   49,192,214, 31,181,199,106,157,184, 84,204,176,115,121,50,45,127, 4,150,254,
   138,236,205,93,222,114,67,29,24,72,243,141,128,195,78,66,215,61,156,180
   };
   static { for (int i=0; i < 256 ; i++) p[256+i] = p[i] = permutation[i]; }
	// END EXTRA CODE
}
