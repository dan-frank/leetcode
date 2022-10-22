package easy.twoSum

/** QUESTION: Given an array of integers nums and an integer target, return
  * indices of the two numbers such that they add up to target.
  */
object Solution {
  def apply(nums: Array[Int], target: Int): Array[Int] = twoSum(nums, target)

  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    calculate(nums, target, 0)

  def calculate(nums: Array[Int], target: Int, count: Int): Array[Int] = {
    nums.headOption match
      case Some(head) =>
        val tail = nums.tail
        val found = tail.filter(x => head + x == target)
        if (found.length > 0)
          Array(count, tail.indexWhere(_ == found.head) + count + 1)
        else
          calculate(tail, target, count + 1)
      case None => Array(0, 0)
  }

  /** Doesn't work for negatives
    */
  def calculate2(nums: Array[Int], target: Int, count: Int): Array[Int] = {
    nums.headOption match
      case Some(head) =>
        val needle = head - target match
          case n if n < 0 => n * -1
          case m          => m
        val tail = nums.tail
        if (tail.contains(needle))
          Array(count, tail.indexWhere(_ == needle) + count + 1)
        else
          calculate2(tail, target, count + 1)
      case None => Array(0, 0)
  }
}
