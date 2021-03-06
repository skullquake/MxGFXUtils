// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gfxutils.proxies;

public class Vec4f extends gfxutils.proxies.Vec3f
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GFXUtils.Vec4f";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		_3("_3"),
		_2("_2"),
		_1("_1"),
		_0("_0"),
		_a1("GFXUtils._a1"),
		_a2("GFXUtils._a2");

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

	public Vec4f(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GFXUtils.Vec4f"));
	}

	protected Vec4f(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec4fMendixObject)
	{
		super(context, vec4fMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("GFXUtils.Vec4f", vec4fMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GFXUtils.Vec4f");
	}

	/**
	 * @deprecated Use 'Vec4f.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static gfxutils.proxies.Vec4f initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return gfxutils.proxies.Vec4f.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static gfxutils.proxies.Vec4f initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new gfxutils.proxies.Vec4f(context, mendixObject);
	}

	public static gfxutils.proxies.Vec4f load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gfxutils.proxies.Vec4f.initialize(context, mendixObject);
	}

	/**
	 * @return value of _3
	 */
	public final java.lang.Integer get_3()
	{
		return get_3(getContext());
	}

	/**
	 * @param context
	 * @return value of _3
	 */
	public final java.lang.Integer get_3(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._3.toString());
	}

	/**
	 * Set value of _3
	 * @param _3
	 */
	public final void set_3(java.lang.Integer _3)
	{
		set_3(getContext(), _3);
	}

	/**
	 * Set value of _3
	 * @param context
	 * @param _3
	 */
	public final void set_3(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _3)
	{
		getMendixObject().setValue(context, MemberNames._3.toString(), _3);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final gfxutils.proxies.Vec4f that = (gfxutils.proxies.Vec4f) obj;
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
		return "GFXUtils.Vec4f";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
