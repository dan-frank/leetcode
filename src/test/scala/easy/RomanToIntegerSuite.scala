package easy

import easy.romanToInteger.Solution

class RomanToIntegerSuite extends munit.FunSuite {
  test("Expect solution 1 from \"I\"") {
    val obtained = Solution("I")
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 5 from \"V\"") {
    val obtained = Solution("V")
    val expected = 5
    assertEquals(obtained, expected)
  }

  test("Expect solution 10 from \"X\"") {
    val obtained = Solution("X")
    val expected = 10
    assertEquals(obtained, expected)
  }

  test("Expect solution 50 from \"L\"") {
    val obtained = Solution("L")
    val expected = 50
    assertEquals(obtained, expected)
  }

  test("Expect solution 100 from \"C\"") {
    val obtained = Solution("C")
    val expected = 100
    assertEquals(obtained, expected)
  }

  test("Expect solution 500 from \"D\"") {
    val obtained = Solution("D")
    val expected = 500
    assertEquals(obtained, expected)
  }

  test("Expect solution 1000 from \"M\"") {
    val obtained = Solution("M")
    val expected = 1000
    assertEquals(obtained, expected)
  }

  test("Expect solution 3 from \"III\"") {
    val obtained = Solution("III")
    val expected = 3
    assertEquals(obtained, expected)
  }

  test("Expect solution 30 from \"XXX\"") {
    val obtained = Solution("XXX")
    val expected = 30
    assertEquals(obtained, expected)
  }

  test("Expect solution 300 from \"CCC\"") {
    val obtained = Solution("CCC")
    val expected = 300
    assertEquals(obtained, expected)
  }

  test("Expect solution 3000 from \"MMM\"") {
    val obtained = Solution("MMM")
    val expected = 3000
    assertEquals(obtained, expected)
  }

  test("Expect solution 4 from \"IV\"") {
    val obtained = Solution("IV")
    val expected = 4
    assertEquals(obtained, expected)
  }

  test("Expect solution 9 from \"IX\"") {
    val obtained = Solution("IX")
    val expected = 9
    assertEquals(obtained, expected)
  }

  test("Expect solution 40 from \"XL\"") {
    val obtained = Solution("XL")
    val expected = 40
    assertEquals(obtained, expected)
  }

  test("Expect solution 90 from \"XC\"") {
    val obtained = Solution("XC")
    val expected = 90
    assertEquals(obtained, expected)
  }

  test("Expect solution 400 from \"CD\"") {
    val obtained = Solution("CD")
    val expected = 400
    assertEquals(obtained, expected)
  }

  test("Expect solution 900 from \"CM\"") {
    val obtained = Solution("CM")
    val expected = 900
    assertEquals(obtained, expected)
  }

  test("Expect solution 58 from \"LVIII\"") {
    val obtained = Solution("LVIII")
    val expected = 58
    assertEquals(obtained, expected)
  }

  test("Expect solution 1994 from \"MCMXCIV\"") {
    val obtained = Solution("MCMXCIV")
    val expected = 1994
    assertEquals(obtained, expected)
  }

  test("Expect solution 3999 from \"MMMCMXCIX\"") {
    val obtained = Solution("MMMCMXCIX")
    val expected = 3999
    assertEquals(obtained, expected)
  }
}
