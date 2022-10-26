package easy

import easy.{PlusOneSolution => Solution}

class PlusOneSuite extends munit.FunSuite {
  test("Expect solution [1,2,4] from [1,2,3]") {
    val obtained = Solution(Array(1, 2, 3))
    val expected = Array(1, 2, 4)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [4,3,2,2] from [4,3,2,1]") {
    val obtained = Solution(Array(4, 3, 2, 1))
    val expected = Array(4, 3, 2, 2)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [1,0] from [9]") {
    val obtained = Solution(Array(9))
    val expected = Array(1, 0)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [1] from []") {
    val obtained = Solution(Array())
    val expected = Array(1)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [1,0,0,0,0,0,0,0] from [9,9,9,9,9,9,9]") {
    val obtained = Solution(Array(9, 9, 9, 9, 9, 9, 9))
    val expected = Array(1, 0, 0, 0, 0, 0, 0, 0)
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution [1,0,0] from [9,9]") {
    val obtained = Solution(Array(9, 9))
    val expected = Array(1, 0, 0)
    assertEquals(obtained.toSeq, expected.toSeq)
  }
}
