package easy

/** QUESTION: Given a non-empty array of integers `nums`, every element appears
  * twice except for one. Find that single one.
  */
object SingleNumberSolution {
  def apply(nums: Array[Int]): Int = singleNumber(nums)

  def singleNumber(nums: Array[Int]): Int = calculateXorFold(nums)

  def calculateFilter(nums: Array[Int]): Int =
    if !nums.tail.contains(nums.head) then nums.head
    else calculateFilter(nums.filter(_ != nums.head))

  def calculateSort(nums: Array[Int]): Int =
    def find(arr: Array[Int], previous: Option[Int] = None): Int =
      if arr.length == 1 then arr.head
      else if arr.head == arr.tail.head then find(arr.tail.tail, Some(arr.head))
      else if previous.fold(false)(_ == arr.head) then
        find(arr.tail, Some(arr.head))
      else arr.head
    find(nums.sorted)

  def calculatePop(
      nums: Array[Int],
      found: Map[Int, Int] = Map.empty,
      head: Int = 0
  ): Int =
    if nums.length == head then
      found.find((key, value) => value == 1).getOrElse((-1, -1))._1
    else
      calculatePop(
        nums,
        found ++ Map(nums(head) -> found.get(nums(head)).fold(1)(_ + 1)),
        head + 1
      )

  /** Resource:
    *   - https://leetcode.com/problems/single-number/solutions/1771771/think-it-through-time-o-n-space-o-1-python-explained/comments/1476373
    *   - https://leetcode.com/problems/single-number/solutions/1772139/c-explained-everything-w-why-xor-works-brute-force-to-optimized-step-by-step-dry-run/
    */
  def calculateXor(nums: Array[Int]): Int =
    if nums.length == 1 then nums.head
    else nums.head ^ calculateXor(nums.tail)

  def calculateXorFold(nums: Array[Int]): Int =
    nums.foldLeft(0)((total, head) => total ^ head)
}
