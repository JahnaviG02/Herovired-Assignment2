import java.util.HashSet;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}



class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void removeDup() {

        HashSet<Integer> set = new HashSet<>();

        Node curr = head;
        Node prev = null;

        while (curr != null) {
            int currValue = curr.data;

            if (set.contains(currValue)) {

                prev.next = curr.next;
            } 
            else {
                set.add(currValue);

                prev = curr;
            }
            curr = curr.next;
        }
    }

    void printList() {
        Node curr = head;

        while (curr != null) {

            System.out.print(curr.data + " ");

            curr = curr.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(1);

        list.head.next = new Node(2);

        list.head.next.next = new Node(2);

        list.head.next.next.next = new Node(3);

        list.head.next.next.next.next = new Node(3);

        list.head.next.next.next.next.next = new Node(4);

        System.out.print("Original List: ");

        list.printList();

        list.removeDup();

        System.out.print("\nModified List is: ");

        list.printList();
    }
}