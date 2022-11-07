package medium

import medium.{PowXNSolution => Solution}
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen
import scala.math.pow

class PowXNSuite extends munit.ScalaCheckSuite {
  override def scalaCheckTestParameters =
    super.scalaCheckTestParameters
      .withMinSuccessfulTests(200)
      .withMaxDiscardRatio(10)

  val powXNDoubleGen: Gen[Double] = Gen.choose(-100.0, 100.0)
  val powXNIntGen: Gen[Int] = Gen.choose(Int.MinValue, Int.MaxValue)
  // TODO -10^4 <= x^n <= 10^4

  property("Expect custom `pow` solution to find correct answer") {
    forAll(powXNDoubleGen, powXNIntGen) { (x: Double, n: Int) =>
      val obtained = Solution(x, n)
      val expected = pow(x, n)
      assertEquals(obtained, expected)
    }
  }

  test("Expect solution 1024.0 from 2.0^10") {
    val obtained = Solution(2, 10)
    val expected = 1024.0
    assertEquals(obtained, expected)
  }

  test("Expect solution 9.261 from 2.1^3") {
    val obtained = Solution(2.1, 3)
    val expected = 9.261000000000001
    assertEquals(obtained, expected)
  }

  test("Expect solution 0.25 from 2.0^-2") {
    val obtained = Solution(2, -2)
    val expected = 0.25
    assertEquals(obtained, expected)
  }

  test("Expect solution 0 from 2.0^-2147483648") {
    val obtained = Solution(2, -2147483648)
    val expected = 0.0
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 from 2.0^0") {
    val obtained = Solution(2, 0)
    val expected = 1.0
    assertEquals(obtained, expected)
  }
}
