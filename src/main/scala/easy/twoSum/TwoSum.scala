package easy.twoSum

/** QUESTION: Given an array of integers nums and an integer target, return
  * indices of the two numbers such that they add up to target.
  */
object Solution {
  def apply(nums: Array[Int], target: Int): Array[Int] = twoSum(nums, target)

  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    calculate(nums, target, 0)
  }

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
}
