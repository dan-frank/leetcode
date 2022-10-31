package easy

import easy.{SqrtXSolution => Solution}

class SqrtXSuite extends munit.FunSuite {
  test("Expect solution [0,1] from [1,2,3,4] with target 3") {
    val obtained = Solution(Array(1, 2, 3, 4), 3)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)
  }
}
