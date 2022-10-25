package medium

import medium.{AddTwoNumbersSolution => Solution, ListNode}

class AddTwoNumbersSuite extends munit.FunSuite {
  def listNode2List(ln: ListNode): List[Int] = {
    Option(ln) match {
      case Some(ln) => ln.`val` +: listNode2List(ln.next)
      case None     => List.empty
    }
  }

  test("Expect solution [7,0,8] (807) from [2,4,3] + [5,6,4]") {
    val l1 = ListNode(2, ListNode(4, ListNode(3)))
    val l2 = ListNode(5, ListNode(6, ListNode(4)))
    val obtained = Solution.addTwoNumbers(l1, l2)
    val expected = ListNode(7, ListNode(0, ListNode(8)))
    assertEquals(listNode2List(obtained), listNode2List(expected))
  }

  test("Expect solution [0] (0) from [0] + [0]") {
    val l1 = ListNode(0)
    val l2 = ListNode(0)
    val obtained = Solution.addTwoNumbers(l1, l2)
    val expected = ListNode(0)
    assertEquals(listNode2List(obtained), listNode2List(expected))
  }

  test(
    "Expect solution [8,9,9,9,0,0,0,1] (10009998) from [9,9,9,9,9,9,9] + [9,9,9,9]"
  ) {
    val l1 = ListNode(
      9,
      ListNode(
        9,
        ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))
      )
    )
    val l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
    val obtained = Solution.addTwoNumbers(l1, l2)
    val expected = ListNode(
      8,
      ListNode(
        9,
        ListNode(
          9,
          ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1)))))
        )
      )
    )
    assertEquals(listNode2List(obtained), listNode2List(expected))
  }

  test("Expect solution [7,3] (37) from [7,3] + [0]") {
    val l1 = ListNode(7, ListNode(3))
    val l2 = ListNode(0)
    val obtained = Solution.addTwoNumbers(l1, l2)
    val expected = ListNode(7, ListNode(3))
    assertEquals(listNode2List(obtained), listNode2List(expected))
  }
}
