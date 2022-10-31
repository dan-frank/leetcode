package easy

import easy.{ReverseStringSolution => Solution}

class ReverseStringSuite extends munit.FunSuite {
  test("Expect solution ['o','l','l','e','h'] from ['h','e','l','l','o']") {
    val obtained: Array[Char] = Array('h', 'e', 'l', 'l', 'o')
    Solution.reverseString(obtained)
    val expected: Array[Char] = Array('o', 'l', 'l', 'e', 'h')
    assertEquals(obtained.toList, expected.toList)
  }

  test(
    "Expect solution ['h','a','n','n','a','H'] from ['H','a','n','n','a','h']"
  ) {
    val obtained: Array[Char] = Array('H', 'a', 'n', 'n', 'a', 'h')
    Solution.reverseString(obtained)
    val expected: Array[Char] = Array('h', 'a', 'n', 'n', 'a', 'H')
    assertEquals(obtained.toList, expected.toList)
  }
}
