// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gfxutils.proxies;

/**
 * Mendix ORM handle on BufferedImages stored in Java instance
 */
public class BufferedImage
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject bufferedImageMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GFXUtils.BufferedImage";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_Id("_Id"),
		width("width"),
		height("height"),
		BufferedImage_Image("GFXUtils.BufferedImage_Image");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public BufferedImage(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GFXUtils.BufferedImage"));
	}

	protected BufferedImage(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject bufferedImageMendixObject)
	{
		if (bufferedImageMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GFXUtils.BufferedImage", bufferedImageMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GFXUtils.BufferedImage");

		this.bufferedImageMendixObject = bufferedImageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'BufferedImage.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static gfxutils.proxies.BufferedImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return gfxutils.proxies.BufferedImage.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static gfxutils.proxies.BufferedImage initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gfxutils.proxies.BufferedImage(context, mendixObject);
	}

	public static gfxutils.proxies.BufferedImage load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gfxutils.proxies.BufferedImage.initialize(context, mendixObject);
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of _Id
	 */
	public final java.lang.String get_Id()
	{
		return get_Id(getContext());
	}

	/**
	 * @param context
	 * @return value of _Id
	 */
	public final java.lang.String get_Id(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._Id.toString());
	}

	/**
	 * Set value of _Id
	 * @param _id
	 */
	public final void set_Id(java.lang.String _id)
	{
		set_Id(getContext(), _id);
	}

	/**
	 * Set value of _Id
	 * @param context
	 * @param _id
	 */
	public final void set_Id(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _id)
	{
		getMendixObject().setValue(context, MemberNames._Id.toString(), _id);
	}

	/**
	 * @return value of width
	 */
	public final java.lang.Integer getwidth()
	{
		return getwidth(getContext());
	}

	/**
	 * @param context
	 * @return value of width
	 */
	public final java.lang.Integer getwidth(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.width.toString());
	}

	/**
	 * Set value of width
	 * @param width
	 */
	public final void setwidth(java.lang.Integer width)
	{
		setwidth(getContext(), width);
	}

	/**
	 * Set value of width
	 * @param context
	 * @param width
	 */
	public final void setwidth(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer width)
	{
		getMendixObject().setValue(context, MemberNames.width.toString(), width);
	}

	/**
	 * @return value of height
	 */
	public final java.lang.Integer getheight()
	{
		return getheight(getContext());
	}

	/**
	 * @param context
	 * @return value of height
	 */
	public final java.lang.Integer getheight(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames.height.toString());
	}

	/**
	 * Set value of height
	 * @param height
	 */
	public final void setheight(java.lang.Integer height)
	{
		setheight(getContext(), height);
	}

	/**
	 * Set value of height
	 * @param context
	 * @param height
	 */
	public final void setheight(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer height)
	{
		getMendixObject().setValue(context, MemberNames.height.toString(), height);
	}

	/**
	 * @return value of BufferedImage_Image
	 */
	public final gfxutils.proxies.Image getBufferedImage_Image() throws com.mendix.core.CoreException
	{
		return getBufferedImage_Image(getContext());
	}

	/**
	 * @param context
	 * @return value of BufferedImage_Image
	 */
	public final gfxutils.proxies.Image getBufferedImage_Image(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		gfxutils.proxies.Image result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.BufferedImage_Image.toString());
		if (identifier != null)
			result = gfxutils.proxies.Image.load(context, identifier);
		return result;
	}

	/**
	 * Set value of BufferedImage_Image
	 * @param bufferedimage_image
	 */
	public final void setBufferedImage_Image(gfxutils.proxies.Image bufferedimage_image)
	{
		setBufferedImage_Image(getContext(), bufferedimage_image);
	}

	/**
	 * Set value of BufferedImage_Image
	 * @param context
	 * @param bufferedimage_image
	 */
	public final void setBufferedImage_Image(com.mendix.systemwideinterfaces.core.IContext context, gfxutils.proxies.Image bufferedimage_image)
	{
		if (bufferedimage_image == null)
			getMendixObject().setValue(context, MemberNames.BufferedImage_Image.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.BufferedImage_Image.toString(), bufferedimage_image.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return bufferedImageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final gfxutils.proxies.BufferedImage that = (gfxutils.proxies.BufferedImage) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "GFXUtils.BufferedImage";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}