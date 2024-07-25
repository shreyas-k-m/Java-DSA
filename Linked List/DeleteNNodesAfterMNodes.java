public class DeleteNNodesAfterMNodes {

    static class Node {
        int data;
        Node next;
        Node(int d) { 
            data = d; 
            next = null; 
        }
    }

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head_ref;
        return new_node;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
        System.out.printf("\n");
    }

    static void skipMdeleteN(Node head, int M, int N) {
        Node curr = head;
        while (curr != null) {
            // Skip M nodes
            for (int count = 1; count < M && curr != null; count++) {
                curr = curr.next;
            }

            // If we reached the end of the list, then return
            if (curr == null) return;

            // Start from the next node and delete N nodes
            Node t = curr.next;
            for (int count = 1; count <= N && t != null; count++) {
                Node temp = t;
                t = t.next;
            }

            // Link the Mth node to the (M+N+1)th node
            curr.next = t;

            // Set current pointer for next iteration
            curr = t;
        }
    }

    public static void main(String[] args) {
        Node head = null;
        int M = 2, N = 3;

        // Creating linked list 1->2->3->4->5->6->7->8->9->10
        for (int i = 10; i > 0; i--) {
            head = push(head, i);
        }

        System.out.printf("M = %d, N = %d \nLinked list we have is:\n", M, N);
        printList(head);

        skipMdeleteN(head, M, N);

        System.out.printf("\nLinked list after deletion is:\n");
        printList(head);
    }
}
