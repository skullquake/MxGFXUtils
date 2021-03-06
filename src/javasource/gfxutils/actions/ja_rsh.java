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

/**
 * >>
 */
public class ja_rsh extends CustomJavaAction<java.lang.Long>
{
	private java.lang.Long l;
	private java.lang.Long r;

	public ja_rsh(IContext context, java.lang.Long l, java.lang.Long r)
	{
		super(context);
		this.l = l;
		this.r = r;
	}

	@java.lang.Override
	public java.lang.Long executeAction() throws Exception
	{
		// BEGIN USER CODE
		return l>>r;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "ja_rsh";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
