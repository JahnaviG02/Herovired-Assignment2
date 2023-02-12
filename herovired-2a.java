class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class MergeList {
    public static ListNode mergeTwo(ListNode l1, ListNode l2) {
        ListNode dm = new ListNode(0);
        ListNode curr = dm;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if (l1 != null) {
            curr.next = l1;
        }

        if (l2 != null) {
            curr.next = l2;
        }

        return dm.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);

        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(6);

        l2.next.next = new ListNode(2);

        ListNode res = mergeTwo(l1, l2);
        System.out.println("Merged Linked List: ");

        while (res != null) {
            System.out.print(res.val + " ");
            res = res.next;
        }
    }
}