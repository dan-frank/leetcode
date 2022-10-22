package easy

import easy.sumOfTwoIntegers.Solution

class SumOfTwoIntegersSuite extends munit.FunSuite {
  test("Expect solution 3 from (1,2)") {
    val obtained = Solution(1, 2)
    val expected = 3
    assertEquals(obtained, expected)
  }

  test("Expect solution 5 from (2,3)") {
    val obtained = Solution(2, 3)
    val expected = 5
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from (5, -3)") {
    val obtained = Solution(5, -3)
    val expected = 2
    assertEquals(obtained, expected)
  }
}
