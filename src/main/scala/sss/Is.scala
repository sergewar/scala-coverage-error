package sss

import eu.timepit.refined.predicates.all.Digit
import eu.timepit.refined.refineV
import sss.UserId

object Is {
  def isPositive(n: Long): Boolean = n > 0

  //  not working with `val`. when trying init idVal it fail immediately
  val idVal = UserId.unsafeFrom(s"iddqd val")

  //  working with `def` until call idDef and then fail
  def idDef = UserId.unsafeFrom(s"iddqd def")
}
