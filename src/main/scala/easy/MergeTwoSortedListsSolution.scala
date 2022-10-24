package easy

/** QUESTION: You are given the heads of two sorted linked lists `list1` and
  * `list2`.
  *
  * Merge the two lists in a one sorted list. The list should be made by
  * splicing together the nodes of the first two lists.
  *
  * Return the head of the merged linked list.
  */
object MergeTwoSortedListsSolution {

  /** Leetcode's definition for singly-linked list.
    */
  class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

  def apply(list1: ListNode, list2: ListNode): ListNode =
    mergeTwoLists(list1, list2)

  def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode =
    calculateLinear(list1, list2)

  /** NOTE: Because we delcare `next` as a variable we can "overwrite" `next`
    * instead of declaring a new ListNode. This is faster and uses less memory,
    * although less "functional".
    */
  def calculateLinear(list1: ListNode, list2: ListNode): ListNode =
    def solve(list1: ListNode, list2: ListNode): ListNode =
      if list2 == null then list1
      else if list1 == null then list2
      else if list1.x < list2.x then
        list1.next = solve(list1.next, list2)
        list1
      else
        list2.next = solve(list1, list2.next)
        list2
    solve(list1, list2)
}
