// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gfxutils.proxies;

public class Rgb
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject rgbMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GFXUtils.Rgb";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		r("r"),
		g("g"),
		b("b");

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

	public Rgb(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GFXUtils.Rgb"));
	}

	protected Rgb(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject rgbMendixObject)
	{
		if (rgbMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("GFXUtils.Rgb", rgbMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GFXUtils.Rgb");

		this.rgbMendixObject = rgbMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Rgb.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static gfxutils.proxies.Rgb initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return gfxutils.proxies.Rgb.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static gfxutils.proxies.Rgb initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gfxutils.proxies.Rgb(context, mendixObject);
	}

	public static gfxutils.proxies.Rgb load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gfxutils.proxies.Rgb.initialize(context, mendixObject);
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
	 * @return value of r
	 */
	public final java.lang.Double getr()
	{
		return getr(getContext());
	}

	/**
	 * @param context
	 * @return value of r
	 */
	public final java.lang.Double getr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.r.toString());
	}

	/**
	 * Set value of r
	 * @param r
	 */
	public final void setr(java.lang.Double r)
	{
		setr(getContext(), r);
	}

	/**
	 * Set value of r
	 * @param context
	 * @param r
	 */
	public final void setr(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double r)
	{
		getMendixObject().setValue(context, MemberNames.r.toString(), r);
	}

	/**
	 * @return value of g
	 */
	public final java.lang.Double getg()
	{
		return getg(getContext());
	}

	/**
	 * @param context
	 * @return value of g
	 */
	public final java.lang.Double getg(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.g.toString());
	}

	/**
	 * Set value of g
	 * @param g
	 */
	public final void setg(java.lang.Double g)
	{
		setg(getContext(), g);
	}

	/**
	 * Set value of g
	 * @param context
	 * @param g
	 */
	public final void setg(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double g)
	{
		getMendixObject().setValue(context, MemberNames.g.toString(), g);
	}

	/**
	 * @return value of b
	 */
	public final java.lang.Double getb()
	{
		return getb(getContext());
	}

	/**
	 * @param context
	 * @return value of b
	 */
	public final java.lang.Double getb(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Double) getMendixObject().getValue(context, MemberNames.b.toString());
	}

	/**
	 * Set value of b
	 * @param b
	 */
	public final void setb(java.lang.Double b)
	{
		setb(getContext(), b);
	}

	/**
	 * Set value of b
	 * @param context
	 * @param b
	 */
	public final void setb(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Double b)
	{
		getMendixObject().setValue(context, MemberNames.b.toString(), b);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return rgbMendixObject;
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
			final gfxutils.proxies.Rgb that = (gfxutils.proxies.Rgb) obj;
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
		return "GFXUtils.Rgb";
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
