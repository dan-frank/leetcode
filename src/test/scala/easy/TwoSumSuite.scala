package easy

import easy.{TwoSumSolution => Solution}

class TwoSumSuite extends munit.FunSuite {
  test("Expect solution [0,1] from [1,2,3,4] with target 3") {
    val obtained = Solution(Array(1, 2, 3, 4), 3)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [0,4] from [4,2,2,2,0] with target 4") {
    val obtained = Solution(Array(4, 2, 2, 2, 0), 4)
    val expected = Array(0, 4)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [0,1] from [2,7,11,15] with target 9") {
    val obtained = Solution(Array(2, 7, 11, 15), 9)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [1,2] from [3,2,4] with target 6") {
    val obtained = Solution(Array(3, 2, 4), 6)
    val expected = Array(1, 2)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [0,1] from [3,3] with target 6") {
    val obtained = Solution(Array(3, 3), 6)
    val expected = Array(0, 1)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [2,4] from [-1,-2,-3,-4,-5] with target -8") {
    val obtained = Solution(Array(-1, -2, -3, -4, -5), -8)
    val expected = Array(2, 4)
    assertEquals(obtained.toSeq, expected.toSeq)
  }
}
