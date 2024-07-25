public class OddEven {

    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    static class Solution {
        Node head;

        void segregateEvenOdd() {
            if (head == null) return;

            Node end = head;
            while (end.next != null)
                end = end.next;
            
            Node new_end = end;

            Node prev = null;
            Node curr = head;

            while (curr != end) {
                if (curr.data % 2 != 0) {
                    if (prev != null) {
                        prev.next = curr.next;
                    } else {
                        head = curr.next;
                    }
                    Node temp = curr.next;
                    new_end.next = curr;
                    curr.next = null;
                    new_end = curr;
                    curr = temp;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }

            if (curr.data % 2 != 0) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    head = curr.next;
                }
                new_end.next = curr;
                curr.next = null;
                new_end = curr;
            }
        }

        void push(int new_data) {
            Node new_node = new Node(new_data);
            new_node.next = head;
            head = new_node;
        }

        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solution llist = new Solution();
        llist.push(11);
        llist.push(10);
        llist.push(8);
        llist.push(6);
        llist.push(4);
        llist.push(2);
        llist.push(0);
        System.out.println("Linked List:");
        llist.printList();
        llist.segregateEvenOdd();
        System.out.println("Updated Linked List:");
        llist.printList();
    }
}
