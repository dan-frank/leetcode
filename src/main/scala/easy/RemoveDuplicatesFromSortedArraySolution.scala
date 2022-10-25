package easy

/** QUESTION: Given an integer array `nums` sorted in non-decreasing order,
  * remove the duplicates in-place such that each unique element appears only
  * once. The relative order of the elements should be kept the same.
  */
object RemoveDuplicatesFromSortedArraySolution {
  def apply(nums: Array[Int]): Int = removeDuplicates(nums)

  def removeDuplicates(nums: Array[Int]): Int = calculteLinear(nums)

  def calculteLinear(nums: Array[Int]): Int =
    def solve(count: Int = 1, lastPos: Int = 0): Int =
      if count > nums.length - 1 then lastPos
      else if nums(count) == nums(lastPos) then solve(count + 1, lastPos)
      else
        nums(lastPos + 1) = nums(count)
        solve(count + 1, lastPos + 1)
    if nums.length < 2 then nums.length
    else solve() + 1
}
