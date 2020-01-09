// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package gfxutils.proxies;

public class Vec1s extends gfxutils.proxies.Data
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "GFXUtils.Vec1s";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
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

	public Vec1s(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "GFXUtils.Vec1s"));
	}

	protected Vec1s(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject vec1sMendixObject)
	{
		super(context, vec1sMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("GFXUtils.Vec1s", vec1sMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a GFXUtils.Vec1s");
	}

	/**
	 * @deprecated Use 'Vec1s.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static gfxutils.proxies.Vec1s initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return gfxutils.proxies.Vec1s.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static gfxutils.proxies.Vec1s initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		if (com.mendix.core.Core.isSubClassOf("GFXUtils.Vec2s", mendixObject.getType()))
			return gfxutils.proxies.Vec2s.initialize(context, mendixObject);

		return new gfxutils.proxies.Vec1s(context, mendixObject);
	}

	public static gfxutils.proxies.Vec1s load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return gfxutils.proxies.Vec1s.initialize(context, mendixObject);
	}

	/**
	 * @return value of _0
	 */
	public final java.lang.String get_0()
	{
		return get_0(getContext());
	}

	/**
	 * @param context
	 * @return value of _0
	 */
	public final java.lang.String get_0(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames._0.toString());
	}

	/**
	 * Set value of _0
	 * @param _0
	 */
	public final void set_0(java.lang.String _0)
	{
		set_0(getContext(), _0);
	}

	/**
	 * Set value of _0
	 * @param context
	 * @param _0
	 */
	public final void set_0(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String _0)
	{
		getMendixObject().setValue(context, MemberNames._0.toString(), _0);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final gfxutils.proxies.Vec1s that = (gfxutils.proxies.Vec1s) obj;
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
		return "GFXUtils.Vec1s";
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
