// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gfxutils.proxies;

public class Vec3i extends gfxutils.proxies.Vec2i
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GFXUtils.Vec3i";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Vec3i(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GFXUtils.Vec3i"));
	}

	protected Vec3i(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec3iMendixObject)
	{
		super(context, vec3iMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("GFXUtils.Vec3i", vec3iMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GFXUtils.Vec3i");
	}

	/**
	 * @deprecated Use 'Vec3i.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static gfxutils.proxies.Vec3i initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return gfxutils.proxies.Vec3i.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static gfxutils.proxies.Vec3i initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("GFXUtils.Vec4i", mendixObject.getType()))
			return gfxutils.proxies.Vec4i.initialize(context, mendixObject);

		return new gfxutils.proxies.Vec3i(context, mendixObject);
	}

	public static gfxutils.proxies.Vec3i load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gfxutils.proxies.Vec3i.initialize(context, mendixObject);
	}

	/**
	 * @return value of _2
	 */
	public final java.lang.Integer get_2()
	{
		return get_2(getContext());
	}

	/**
	 * @param context
	 * @return value of _2
	 */
	public final java.lang.Integer get_2(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Integer) getMendixObject().getValue(context, MemberNames._2.toString());
	}

	/**
	 * Set value of _2
	 * @param _2
	 */
	public final void set_2(java.lang.Integer _2)
	{
		set_2(getContext(), _2);
	}

	/**
	 * Set value of _2
	 * @param context
	 * @param _2
	 */
	public final void set_2(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Integer _2)
	{
		getMendixObject().setValue(context, MemberNames._2.toString(), _2);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final gfxutils.proxies.Vec3i that = (gfxutils.proxies.Vec3i) obj;
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
		return "GFXUtils.Vec3i";
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
