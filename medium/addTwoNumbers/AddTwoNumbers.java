class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println("test");
        
        ListNode l1 = new ListNode(3);
        l1 = new ListNode(4, l1);
        l1 = new ListNode(2, l1);

        ListNode l2 = new ListNode(4);
        l2 = new ListNode(6, l2);
        l2 = new ListNode(5, l2);

        printList(l1);
        System.out.println("");
        printList(l2);
        System.out.println("");

        ListNode l3 = addTwoNumbers(l1, l2);
        printList(l3);
        System.out.println("");
    }

    public static void printList(ListNode root) {
        if (root.next != null) {
            printList(root.next);
        }
        System.out.print(root.val);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1.val += l2.val;
        if (l1.next != null && l2.next != null)
            addTwoNumbers(l1.next, l2.next);
        if (l1.val > 9) {
            l1.val -= 10;
            l1.next.val += 1;
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
