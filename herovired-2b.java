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
        if (l1 == null) {

            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        if (l1.val < l2.val) {

            l1.next = mergeTwo(l1.next, l2);

            return l1;
        } else {
            l2.next = mergeTwo(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(5);

        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(7);
        l2.next = new ListNode(6);

        l2.next.next = new ListNode(2);

        ListNode res = mergeTwo(l1, l2);
                System.out.println("Sorted Linked List: ");

        while (res != null) {
            System.out.print(res.val + " ");

            res = res.next;
        }
    }
}