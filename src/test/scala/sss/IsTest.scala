package sss

import org.scalatest.flatspec.{AnyFlatSpec, AsyncFlatSpec}
import org.scalatest.matchers.should.Matchers

class IsTest extends AnyFlatSpec with Matchers {

  "5" `should` "positive" in {
    Is.isPositive(5) `shouldBe` true
  }

  "-5" `should` "negative" in {
    Is.isPositive(-5) `shouldBe` false
  }

  "iddqd" `should` "val" in {
    Is.idVal `shouldBe` UserId.unsafeFrom("iddqd val")
  }

  "iddqd" `should` "def" in {
    Is.idDef `shouldBe` UserId.unsafeFrom("iddqd def")
  }

  "iddqd1" `should` "val" in {
    Is.idVal `shouldNot` be(UserId.unsafeFrom("iddqd1"))
  }

}
