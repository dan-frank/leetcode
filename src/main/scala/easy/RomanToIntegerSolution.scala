package easy

/** QUESTION: Roman numerals are represented by seven different symbols: `I`,
  * `V`, `X`, `L`, `C`, `D` and `M`. Given a roman numeral, convert it to an
  * integer.
  *
  * | Symbol | Value |
  * |:-------|:------|
  * | I      | 1     |
  * | V      | 5     |
  * | X      | 10    |
  * | L      | 50    |
  * | C      | 100   |
  * | D      | 500   |
  * | M      | 1000  |
  *
  * NOTE: If smaller numeral (of at most two "levels") is before larger,
  * subtract it from larger i.e.:
  *
  * | Symbol | Value |
  * |:-------|:------|
  * | IV     | 4     |
  * | IX     | 9     |
  * | XL     | 40    |
  * | XC     | 90    |
  * | CD     | 400   |
  * | CM     | 900   |
  */
object RomanToIntegerSolution {
  def apply(s: String): Int = romanToInt(s)

  def romanToInt(s: String): Int = calculateReplace(s)

  val romanInts: Map[String, Int] = Map(
    "I" -> 1,
    "V" -> 5,
    "X" -> 10,
    "L" -> 50,
    "C" -> 100,
    "D" -> 500,
    "M" -> 1000
  )

  val romanIntsPlus: Map[String, Int] = romanInts ++ Map(
    "IV" -> 4,
    "IX" -> 9,
    "XL" -> 40,
    "XC" -> 90,
    "CD" -> 400,
    "CM" -> 900
  )

  def calculateLinear(s: String): Int =
    def solve(numerals: List[String]): Int =
      if numerals.length == 0 then 0
      else if numerals.length == 1 then romanIntsPlus(numerals.head)
      else if romanIntsPlus(numerals.head) < romanIntsPlus(
          numerals.tail.head
        )
      then
        romanIntsPlus(numerals.take(2).mkString("")) + solve(
          numerals.tail.tail
        )
      else romanIntsPlus(numerals.head) + solve(numerals.tail)
    solve(s.split("").toList)

  def calculateReverse(s: String): Int =
    def solve(numerals: String, prev: Int = 0): Int =
      if numerals.length == 0 then 0
      else
        val int = romanInts(numerals(0).toString)
        if int < prev then solve(numerals.tail, int) - int
        else solve(numerals.tail, int) + int
    solve(s.reverse)

  def calculateFold(s: String): Int =
    val numeralPairs = ((s zip s.tail).reverse :+ (s(s.length - 1), ""))
    numeralPairs.foldLeft(0) { (total, pair) =>
      val numeral = romanInts.getOrElse(pair._1.toString, 0)
      val previous = romanInts.getOrElse(pair._2.toString, 0)
      if (numeral < previous) total - numeral
      else total + numeral
    }

    /** Not the most versatile solution, but very fast and simple for the
      * constraints of the problem.
      *
      * Source:
      *   - https://leetcode.com/problems/roman-to-integer/solutions/2428756/python-easily-understood-faster-than-98-less-than-76-o-n/
      */
  def calculateReplace(s: String): Int =
    (s
      .replace("IV", "IIII")
      .replace("IX", "VIIII")
      .replace("XL", "XXXX")
      .replace("XC", "LXXXX")
      .replace("CD", "CCCC")
      .replace("CM", "DCCCC"))
      .foldLeft(0)((total, next) => total + romanInts(next.toString))
}
