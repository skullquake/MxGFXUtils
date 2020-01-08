package gfxutils.support;
public class BufferedImageStorage{
	private static BufferedImageStorage instance=null;
	private static java.util.HashMap<java.lang.String,java.awt.image.BufferedImage> hmbi= new java.util.HashMap<java.lang.String,java.awt.image.BufferedImage>();
	private BufferedImageStorage(){
		//com.mendix.core.Core.getLogger("BufferedImageStorage").info("ctor");//verbocity!!!
	}
	public static synchronized BufferedImageStorage getInstance(){
		//com.mendix.core.Core.getLogger("BufferedImageStorage").info("getinstance");//verbocity!!!
		if(BufferedImageStorage.instance==null) {
			BufferedImageStorage.instance=new BufferedImageStorage();
		}
		return BufferedImageStorage.instance;
	}
	public static java.util.HashMap<java.lang.String,java.awt.image.BufferedImage> getBufferedImages(){
		return BufferedImageStorage.hmbi;
	}
	public static java.awt.image.BufferedImage getBufferedImage(java.lang.String k){
		return BufferedImageStorage.hmbi.get(k);
	}
	public static java.lang.String createBufferedImage(int width,int height){
		java.awt.image.BufferedImage bi=new java.awt.image.BufferedImage(
			width,
			height,
			java.awt.image.BufferedImage.TYPE_INT_RGB
		);            
		java.lang.String sid=new java.lang.String("bi_"+BufferedImageStorage.hmbi.size());
		BufferedImageStorage.hmbi.put(
			sid,
			bi
		);
		return sid;
	}
	public static java.lang.Boolean removeBufferedImage(java.lang.String k){
		java.lang.Boolean ret=false;
		if(BufferedImageStorage.hmbi.get(k)!=null){
			BufferedImageStorage.hmbi.remove(k);
			ret=true;
		}else{
		}
		return ret;
	}

}
