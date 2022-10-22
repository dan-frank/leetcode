package easy

import easy.singleNumber.Solution

class SingleNumberSuite extends munit.FunSuite {
  test("Expect solution 1 from [2,2,1]") {
    val obtained = Solution(Array(2, 2, 1))
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 4 from [4,1,2,1,2]") {
    val obtained = Solution(Array(4, 1, 2, 1, 2))
    val expected = 4
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 from [1]") {
    val obtained = Solution(Array(1))
    val expected = 1
    assertEquals(obtained, expected)
  }
}
