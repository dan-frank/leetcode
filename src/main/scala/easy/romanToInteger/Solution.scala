package easy.romanToInteger

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
  * NOTE: If smaller numeral (of at most two "levels"") is before larger,
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
object Solution {
  def apply(s: String): Int = romanToInt(s)

  def romanToInt(s: String): Int = ???
}
