package easy

/** QUESTION: Given a string `s`, find the length of the longest substring
  * without repeating characters.
  */
object LongestCommonPrefixSolution {
  def apply(strs: Array[String]): String = longestCommonPrefix(strs)

  def longestCommonPrefix(strs: Array[String]): String =
    calculateLinear(strs)

  def calculateNaive(strs: Array[String]): String =
    def solve(strs: Array[String], count: Int = 1): String =
      val found = strs.filter(s => s.take(count) == strs.head.take(count))
      if found.length != strs.length then strs.head.take(count - 1)
      else solve(strs, count + 1)
    if strs.length < 2 then strs.headOption.fold("")(s => s)
    else solve(strs.sortWith(_.length < _.length))

  def calculateDivideAndConquer(strs: Array[String]): String =
    def commonPrefix(str1: String, str2: String): String =
      if str1.isEmpty then ""
      else if str2.indexOf(str1) == 0 then str1
      else commonPrefix(str1.substring(0, str1.length - 1), str2)

    def solve(left: Int, right: Int): String =
      if left == right then strs(left)
      else
        val mid = (left + right) / 2
        commonPrefix(solve(left, mid), solve(mid + 1, right))

    if strs.length < 2 then strs.headOption.fold("")(s => s)
    else solve(0, strs.length - 1)

  def calculateLinear(strs: Array[String]): String =
    def commonPrefix(str1: String, str2: String): String =
      if str1.isEmpty then ""
      else if str2.indexOf(str1) == 0 then str1
      else commonPrefix(str1.substring(0, str1.length - 1), str2)

    def solve(prefix: String, count: Int = 1): String =
      if count == strs.length then prefix
      else if prefix.isEmpty then ""
      else solve(commonPrefix(prefix, strs(count)), count + 1)

    if strs.length == 0 then return "";
    else solve(strs.head)
}
