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

public class ja_bufferedimage_vline extends CustomJavaAction<java.lang.Boolean>
{
	private IMendixObject __obj_bufferedimage;
	private gfxutils.proxies.BufferedImage obj_bufferedimage;
	private java.lang.Long x;
	private java.lang.Long y;
	private java.lang.Long h;
	private java.lang.Long r;
	private java.lang.Long g;
	private java.lang.Long b;

	public ja_bufferedimage_vline(IContext context, IMendixObject obj_bufferedimage, java.lang.Long x, java.lang.Long y, java.lang.Long h, java.lang.Long r, java.lang.Long g, java.lang.Long b)
	{
		super(context);
		this.__obj_bufferedimage = obj_bufferedimage;
		this.x = x;
		this.y = y;
		this.h = h;
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		this.obj_bufferedimage = __obj_bufferedimage == null ? null : gfxutils.proxies.BufferedImage.initialize(getContext(), __obj_bufferedimage);

		// BEGIN USER CODE
		throw new com.mendix.systemwideinterfaces.MendixRuntimeException("Java action was not implemented");
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_bufferedimage_vline";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}