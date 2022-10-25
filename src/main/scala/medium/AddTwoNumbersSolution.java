package medium;

/** QUESTION: You are given two non-empty linked lists representing two
  * non-negative integers. The digits are stored in reverse order, and each of
  * their nodes contains a single digit. Add the two numbers and return the sum
  * as a linked list.
  */
class AddTwoNumbersSolution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1.val += l2.val;
        if (l1.val > 9) {
            l1.val -= 10;
            if (l1.next != null) {
                l1.next.val += 1;
            } else {
                l1.next = new ListNode(1);
            }
        }
        if (l1.next != null && l2.next != null) {
            addTwoNumbers(l1.next, l2.next);
        } else if (l1.next != null) {
            addTwoNumbers(l1.next, new ListNode(0));
        } else if (l2.next != null) {
            l1.next = new ListNode(0);
            addTwoNumbers(l1.next, l2.next);
        }
        return l1;
    }
}

class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
