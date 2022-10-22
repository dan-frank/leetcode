package easy.twoSum

/** QUESTION: Given an array of integers nums and an integer target, return
  * indices of the two numbers such that they add up to target.
  */
object Solution {
  def apply(nums: Array[Int], target: Int): Array[Int] = twoSum(nums, target)

  def twoSum(nums: Array[Int], target: Int): Array[Int] =
    calculateContains(nums, target)

  def calculateFilter(
      nums: Array[Int],
      target: Int,
      count: Int = 0
  ): Array[Int] = {
    nums.headOption match
      case Some(head) =>
        val found = nums.tail.filter(x => head + x == target)
        if (found.length > 0)
          Array(count, nums.tail.indexWhere(_ == found.head) + count + 1)
        else
          calculateFilter(nums.tail, target, count + 1)
      case None => Array(0, 0)
  }

  def calculateContains(
      nums: Array[Int],
      target: Int,
      count: Int = 0
  ): Array[Int] = {
    nums.headOption match
      case Some(head) =>
        val needle = target - head
        if (nums.tail.contains(needle))
          Array(count, nums.tail.indexWhere(_ == needle) + count + 1)
        else
          calculateContains(nums.tail, target, count + 1)
      case None => Array(0, 0)
  }
}
