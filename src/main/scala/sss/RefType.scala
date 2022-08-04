package sss

import eu.timepit.refined.api.{RefinedType, RefinedTypeOps}

abstract class RefType[T, RT](using rt: RefinedType.AuxT[RT, T]):
  opaque type Type = RT

  private val Ops = new RefinedTypeOps[RT, T]

  inline def apply(a: RT): Type = a

  def unsafeFrom(t: T): Type = apply(Ops.unsafeFrom(t))
