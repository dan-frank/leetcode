package easy

import easy.{SqrtXSolution => Solution}

class SqrtXSuite extends munit.FunSuite {
  test("Expect solution 0 from 0") {
    val obtained = Solution(0)
    val expected = 0
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 from 1") {
    val obtained = Solution(1)
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 from 3") {
    val obtained = Solution(3)
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from 4") {
    val obtained = Solution(4)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from 5") {
    val obtained = Solution(5)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from 6") {
    val obtained = Solution(6)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from 7") {
    val obtained = Solution(7)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 2 from 8") {
    val obtained = Solution(8)
    val expected = 2
    assertEquals(obtained, expected)
  }

  test("Expect solution 3 from 9") {
    val obtained = Solution(9)
    val expected = 3
    assertEquals(obtained, expected)
  }

  test("Expect solution 73 from 5426") {
    val obtained = Solution(5426)
    val expected = 73
    assertEquals(obtained, expected)
  }

  test("Expect solution 46340 from 2147483647") {
    val obtained = Solution(2147483647)
    val expected = 46340
    assertEquals(obtained, expected)
  }
}
