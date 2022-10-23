package easy

import easy.{ValidParenthesesSolution => Solution}

class ValidParenthesesSuite extends munit.FunSuite {
  test("Expect solution true from \"()\"") {
    val obtained = Solution("()")
    val expected = true
    assertEquals(obtained, expected)
  }

  test("Expect solution true from \"()[]{}\"") {
    val obtained = Solution("()[]{}")
    val expected = true
    assertEquals(obtained, expected)
  }

  test("Expect solution true from \"((()))\"") {
    val obtained = Solution("((()))")
    val expected = true
    assertEquals(obtained, expected)
  }

  test("Expect solution true from \"([{}])\"") {
    val obtained = Solution("([{}])")
    val expected = true
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"(]\"") {
    val obtained = Solution("(]")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"(()]\"") {
    val obtained = Solution("(()]")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"{[{([[]])}])\"") {
    val obtained = Solution("{[{([[]])}])")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"{[{([[}])}]}\"") {
    val obtained = Solution("{[{([[}])}]}")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"(\"") {
    val obtained = Solution("(")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"[\"") {
    val obtained = Solution("[")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"{\"") {
    val obtained = Solution("{")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \")\"") {
    val obtained = Solution(")")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"]\"") {
    val obtained = Solution("]")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"}\"") {
    val obtained = Solution("{")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"{[{([[]])}]\"") {
    val obtained = Solution("{[{([[]])}]")
    val expected = false
    assertEquals(obtained, expected)
  }

  test("Expect solution false from \"[{([[]])}]}\"") {
    val obtained = Solution("[{([[]])}]}")
    val expected = false
    assertEquals(obtained, expected)
  }
}
