package medium

import scala.annotation.varargs

object PowXNSolution {
  def apply(x: Double, n: Int): Double = myPow(x, n)

  def myPow(x: Double, n: Int): Double = calculateBinary(x, n)

  // ! Fails when `n == Int.MinValue`
  def calculateFold(x: Double, n: Int): Double =
    List
      .fill(if n >= 0 then n else n * -1)(if n >= 0 then x else 1 / x)
      .foldLeft(1.0)(_ * _)

  def calculateRecurse(x: Double, n: Int): Double =
    def solve(x: Double, n: Int): Double =
      if n == 0 then 1
      else if n % 2 == 0 then solve(x * x, n / 2)
      else x * solve(x, n - 1)
    val (trueX, trueN) =
      if n == Int.MinValue then (1 / (x * x), n / 2 * -1)
      else if n < 0 then (1 / x, n * -1)
      else (x, n)
    solve(trueX, trueN)

  // ? https://leetcode.com/problems/powx-n/solutions/19563/iterative-log-n-solution-with-clear-explanation/
  def calculateBinary(x: Double, n: Int): Double =
    def solve(ans: Double, x: Double, absN: Long): Double =
      if absN <= 0 then ans
      else if (absN & 1) == 1 then solve(ans * x, x * x, absN >> 1)
      else solve(ans, x * x, absN >> 1)
    val ans = solve(1, x, scala.math.abs(n.toLong))
    if n < 0 then 1 / ans else ans
}
