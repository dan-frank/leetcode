package easy

/** QUESTION: Given a string `s` containing just the characters '(', ')', '{',
  * '}', '[' and ']', determine if the input string is valid.
  */
object ValidParenthesesSolution {
  def apply(s: String): Boolean = isValid(s)

  def isValid(s: String): Boolean = calculateStackListReduced(s)

  def calculateStack(s: String): Boolean =
    var stack = scala.collection.mutable.Stack[Char]()

    var i = 0
    while i < s.length do
      s(i) match
        case '(' | '[' | '{' => stack.push(s(i))
        case ')' | ']' | '}' =>
          if stack.isEmpty then return false
          var top = stack.pop
          top match {
            case '(' => if s(i) != ')' then return false
            case '[' => if s(i) != ']' then return false
            case '{' => if s(i) != '}' then return false
          }
        case _ => return false
      i += 1

    stack.isEmpty

  def calculateStackList(s: String): Boolean =
    def resolveBracket(open: Char, close: Char): Boolean =
      open match
        case '(' => close == ')'
        case '[' => close == ']'
        case '{' => close == '}'
        case _   => false

    def solve(stack: List[Char], count: Int = 1): Boolean =
      if s.length <= count then stack.isEmpty
      else
        s(count) match
          case '(' | '[' | '{' => solve(s(count) +: stack, count + 1)
          case ')' | ']' | '}' =>
            stack.headOption match
              case Some(top) =>
                if resolveBracket(top, s(count)) then
                  solve(stack.tail, count + 1)
                else false
              case None => false
          case _ => s.length == count
    if s.length % 2 != 0 then false
    else solve(s.headOption.fold(Nil)(head => List(head)))

  def calculateStackListReduced(s: String): Boolean =
    val brackets: Map[Char, Char] = Map('(' -> ')', '[' -> ']', '{' -> '}')

    def solve(stack: List[Char], count: Int = 1): Boolean =
      if s.length <= count then stack.isEmpty
      else if brackets.contains(s(count)) then
        solve(s(count) +: stack, count + 1)
      else if stack.isEmpty then false
      else if brackets(stack.head) == s(count) then solve(stack.tail, count + 1)
      else false

    if s.length % 2 != 0 then false
    else solve(s.headOption.fold(Nil)(head => List(head)))
}
