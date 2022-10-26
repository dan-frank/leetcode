package easy

/** QUESTION: You are given a large integer represented as an integer array
  * `digits`, where each `digits[i]` is the `ith` digit of the integer. The
  * digits are ordered from most significant to least significant in
  * left-to-right order. The large integer does not contain any leading `0`'s.
  *
  * Increment the large integer by one and return the resulting array of digits.
  */
object PlusOneSolution {
  def apply(digits: Array[Int]): Array[Int] = plusOne(digits)

  def plusOne(digits: Array[Int]): Array[Int] = calculateLinear(digits)

  def calculateLinear(digits: Array[Int]): Array[Int] =
    def solve(count: Int): Array[Int] =
      if digits(count) < 9 then
        digits(count) += 1
        digits
      else
        digits(count) = 0
        if count == 0 then 1 +: digits
        else solve(count - 1)
    if digits.length == 0 then Array(1)
    else solve(digits.length - 1)

    /** NOTE: Nicer to read than `calculateLinear` but performs slower as we
      * have to create a reverse the array twice, covert to list, and convert to
      * array.
      */
  def calculateLinearList(digits: Array[Int]): Array[Int] =
    def solve(rdigits: List[Int]): List[Int] =
      rdigits.headOption match
        case Some(head) =>
          if head < 9 then (head + 1) +: rdigits.tail
          else 0 +: solve(rdigits.tail)
        case None => List(1)
    solve(digits.reverse.toList).reverse.toArray

    /** NOTE: Bad as you create list to convert to array, and always loop the
      * entire array.
      */
  def calculateFold(digits: Array[Int]): Array[Int] =
    if digits.length == 0 then Array(1)
    else
      val (arr, r) = digits.foldRight((List.empty[Int], 1)) {
        case (9, (acc, r)) => (((9 + r) % 10) +: acc, r)
        case (d, (acc, r)) => ((d + r) +: acc, 0)
      }
      (r match {
        case 1 => r +: arr
        case 0 => arr
      }).toArray
}
