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
    }

    public static void printList(ListNode root) {
        if (root.next != null) {
            printList(root.next);
        }
        System.out.print(root.val);
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
