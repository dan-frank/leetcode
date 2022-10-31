package easy

import easy.{SqrtXSolution => Solution}
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen
import scala.math.sqrt

class SqrtXSuite extends munit.ScalaCheckSuite {

  override def scalaCheckTestParameters =
    super.scalaCheckTestParameters
      .withMinSuccessfulTests(2000)
      .withMaxDiscardRatio(10)

  val sqrtGen: Gen[Int] = Gen.choose(0, Int.MaxValue)

  property("Expect floored Int of squared root from solution") {
    forAll(sqrtGen) { (n: Int) =>
      val obtained = Solution(n)
      val expected = sqrt(n).floor.toInt
      assertEquals(obtained, expected)
    }
  }

  test("Expect solution 46340 from 2147483647") {
    val obtained = Solution(2147483647)
    val expected = 46340
    assertEquals(obtained, expected)
  }
}
