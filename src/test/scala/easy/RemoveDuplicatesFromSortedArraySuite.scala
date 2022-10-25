package easy

import easy.{RemoveDuplicatesFromSortedArraySolution => Solution}

class RemoveDuplicatesFromSortedArraySuite extends munit.FunSuite {
  test("Expect solution 2 ([1,2]) from [1,1,2]") {
    val obtained = Solution(Array(1, 1, 2))
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 5 ([0,1,2,3,4]) from [0,0,1,1,1,2,2,3,3,4]") {
    val obtained = Solution(Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4))
    val expected = 5
    assertEquals(obtained, expected)
  }

  test("Expect solution 0 ([]) from []") {
    val obtained = Solution(Array())
    val expected = 0
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 ([1]) from [1]") {
    val obtained = Solution(Array(1))
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 ([1]) from [1,1,1,1,1]") {
    val obtained = Solution(Array(1, 1, 1, 1, 1))
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 ([0,1]) from [0,1,1,1,1]") {
    val obtained = Solution(Array(0, 1, 1, 1, 1))
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 ([0,1]) from [0,0,0,0,1]") {
    val obtained = Solution(Array(0, 0, 0, 0, 1))
    val expected = 2
    assertEquals(obtained, expected)
  }
}
