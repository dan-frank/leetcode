package medium

import medium.{LongestSubstringWithoutRepeatingCharactersSolution => Solution}

class LongestSubstringWithoutRepeatingCharactersSuite extends munit.FunSuite {
  test("Expect solution 3 from \"abcabcbb\"") {
    val obtained = Solution("abcabcbb")
    val expected = 3
    assertEquals(obtained, expected)
  }

  test("Expect solution 1 from \"bbbbb\"") {
    val obtained = Solution("bbbbb")
    val expected = 1
    assertEquals(obtained, expected)
  }

  test("Expect solution 3 from \"pwwkew\"") {
    val obtained = Solution("pwwkew")
    val expected = 3
    assertEquals(obtained, expected)
  }
}
