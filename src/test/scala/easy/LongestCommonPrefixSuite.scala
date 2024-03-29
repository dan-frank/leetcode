package easy

import easy.{LongestCommonPrefixSolution => Solution}

class LongestCommonPrefixSuite extends munit.FunSuite {
  test("Expect solution \"fl\" from [\"flower\",\"flow\",\"flight\"]") {
    val obtained = Solution(Array("flower", "flow", "flight"))
    val expected = "fl"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"\" from [\"dog\",\"racecar\",\"car\"]") {
    val obtained = Solution(Array("dog", "racecar", "car"))
    val expected = ""
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"in\" from [\"indgo\",\"innocent\",\"india\"]") {
    val obtained = Solution(Array("indgo", "innocent", "india"))
    val expected = "in"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test(
    "Expect solution \"abcdefghijklmnopqrstuvwxyz\" from [\"abcdefghijklmnopqrstuvwxyza\",\"abcdefghijklmnopqrstuvwxyzb\",\"abcdefghijklmnopqrstuvwxyzc\"]"
  ) {
    val obtained = Solution(
      Array(
        "abcdefghijklmnopqrstuvwxyza",
        "abcdefghijklmnopqrstuvwxyzb",
        "abcdefghijklmnopqrstuvwxyzc"
      )
    )
    val expected = "abcdefghijklmnopqrstuvwxyz"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test(
    "Expect solution \"abc\" from [\"abc\",\"abcdefghijklmnopqrstuvwxyza\",\"abcdefghijklmnopqrstuvwxyzb\"]"
  ) {
    val obtained = Solution(
      Array("abc", "abcdefghijklmnopqrstuvwxyza", "abcdefghijklmnopqrstuvwxyzb")
    )
    val expected = "abc"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"dog\" from [\"dog\"]") {
    val obtained = Solution(Array("dog"))
    val expected = "dog"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"\" from [\"\"]") {
    val obtained = Solution(Array(""))
    val expected = ""
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"\" from []") {
    val obtained = Solution(Array())
    val expected = ""
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"\" from [\"\",\"\"]") {
    val obtained = Solution(Array("", ""))
    val expected = ""
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"c\" from [\"cir\",\"car\"]") {
    val obtained = Solution(Array("cir", "car"))
    val expected = "c"
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"\" from [\"aca\",\"cba\"]") {
    val obtained = Solution(Array("aca", "cba"))
    val expected = ""
    assertEquals(obtained.toSeq, expected.toSeq)
  }

  test("Expect solution \"ab\" from [\"abab\",\"aba\",\"abc\"]") {
    val obtained = Solution(Array("abab", "aba", "abc"))
    val expected = "ab"
    assertEquals(obtained.toSeq, expected.toSeq)
  }
}
