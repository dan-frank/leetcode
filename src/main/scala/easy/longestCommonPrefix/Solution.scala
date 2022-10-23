package easy.longestCommonPrefix

object Solution {
  def apply(strs: Array[String]): String = longestCommonPrefix(strs)

  def longestCommonPrefix(strs: Array[String]): String =
    calculateNaiveSort(strs)

  def calculateNaive(strs: Array[String]): String =
    def solve(strs: Array[String], count: Int = 1): String =
      val found = strs.filter(s => s.take(count) == strs.head.take(count))
      if found.length != strs.length then strs.head.take(count - 1)
      else solve(strs, count + 1)
    if strs.length == 0 then ""
    else if strs.length == 1 then strs.head
    else solve(strs)

  def calculateNaiveSort(strs: Array[String]): String =
    def solve(strs: Array[String], count: Int = 1): String =
      val found = strs.filter(s => s.take(count) == strs.head.take(count))
      if found.length != strs.length then strs.head.take(count - 1)
      else solve(strs, count + 1)
    if strs.length == 0 then ""
    else if strs.length == 1 then strs.head
    else solve(strs.sortWith(_.length < _.length))
}
