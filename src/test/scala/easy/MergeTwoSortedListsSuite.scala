package easy

import easy.{MergeTwoSortedListsSolution => Solution}
import easy.MergeTwoSortedListsSolution.ListNode

class MergeTwoSortedListsSuite extends munit.FunSuite {
  def ListNode2List(list: ListNode): List[Int] =
    if list == null then Nil
    else list.x +: ListNode2List(list.next)

  test("Expect solution [] from [], []") {
    val obtained = ListNode2List(Solution(null, null))
    val expected = ListNode2List(null)
    assertEquals(obtained, expected)
  }

  test("Expect solution [0] from [], [0]") {
    val obtained = ListNode2List(Solution(null, ListNode()))
    val expected = ListNode2List(ListNode(0))
    assertEquals(obtained, expected)
  }

  test("Expect solution [0] from [0], []") {
    val obtained = ListNode2List(Solution(ListNode(), null))
    val expected = ListNode2List(ListNode(0))
    assertEquals(obtained, expected)
  }

  test("Expect solution [0,0] from [0], [0,0]") {
    val obtained = ListNode2List(Solution(ListNode(), ListNode()))
    val expected = ListNode2List(ListNode(0, ListNode(0)))
    assertEquals(obtained, expected)
  }

  test("Expect solution [0,0] from [1,2,4], [1,3,4]") {
    val list1 = ListNode(1, ListNode(2, ListNode(4)))
    val list2 = ListNode(1, ListNode(3, ListNode(4)))
    val obtained = ListNode2List(Solution(list1, list2))
    val expected = ListNode2List(
      ListNode(
        1,
        ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4)))))
      )
    )
    assertEquals(obtained, expected)
  }
}
