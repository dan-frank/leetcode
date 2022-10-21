package easy.sumOfTwoIntegers

/** QUESTION: Given two integers a and b, return the sum of the two integers
  * without using the operators + and -.
  *
  * Resources:
  *   - https://iq.opengenus.org/addition-using-bitwise-operations/
  *   - https://leetcode.com/problems/sum-of-two-integers/solutions/84278/a-summary-how-to-use-bit-manipulation-to-solve-problems-easily-and-efficiently/
  */
object Solution {
  def apply(a: Int, b: Int): Int = getSum(a, b)

  def getSum(a: Int, b: Int): Int = getSumBitwise(a, b)

  def getSumBitwise(a: Int, b: Int): Int =
    if b == 0 then a
    else getSumBitwise(a ^ b, (a & b) << 1)

  /** Doesn't work for adding negatives
    */
  def getSumList(a: Int, b: Int): Int = {
    val l = List.fill(a)(0) ++: List.fill(b)(1)
    l.length
  }
}
