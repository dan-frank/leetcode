package easy

/** QUESTION: Given a non-negative integer x, return the square root of x
  * rounded down to the nearest integer. The returned integer should be
  * non-negative as well.
  */
object SqrtXSolution {
  def apply(x: Int): Int = mySqrt(x)

  def mySqrt(x: Int): Int = calculateBitManipulation(x)

  def calculateStepByStep(x: Int): Int =
    def solve(square: Int = 2, lastResult: Int = 1): Int =
      val result = (x - scala.math.pow(square, 2)).floor.toInt
      if result == 0 then square
      else if result < 0 then square - 1
      else solve(square + 1, result)
    if x < 2 then x
    else solve()

  def calculateBinarySearch(x: Int): Int =
    def solve(left: Int = 1, right: Int = x): Int =
      if left >= right - 1 then
        if x / right >= right then right
        else left
      else
        val mid = left + (right - left) / 2
        if x / mid >= mid then solve(mid, right)
        else solve(left, mid - 1)
    if x < 2 then x
    else solve()

  def calculateNewton(x: Int): Int =
    def solve(r: Int): Int =
      if r.toLong * r <= x then r
      else solve(((r.toLong + x / r) / 2).toInt)
    if x < 2 then x
    else solve(x)

  /** NOTE: Do not understand, but is cool.
    *   - https://leetcode.com/problems/sqrtx/solutions/25048/share-my-o-log-n-solution-using-bit-manipulation/
    */
  def calculateBitManipulation(x: Int): Int =
    def mostSig(h: Int = 0): Int =
      val hl = (1 << h).toLong
      if hl * hl > x then h - 1
      else mostSig(h + 1)

    def solve(b: Int, res: Int): Int =
      if b < 0 then res
      else
        val r1 = res | (1 << b)
        if r1.toLong * r1 <= x then solve(b - 1, r1)
        else solve(b - 1, res)
    if x < 2 then x
    else
      val most = mostSig()
      solve(most - 1, 1 << most)
}
