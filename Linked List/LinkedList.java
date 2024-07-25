import java.util.Queue;

public class LinkedList implements Queue<Integer> {
    public static class  Node { //node class
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size; //size of ll

    public void addFirst(int data) { //add first in LL

        //step1 = create new node
        Node newNode = new Node(data);
        size++; //size ++
        if(head == null) {
            head = tail = newNode;
            return;
        }

        //step 2 =  newNode next =  head
        newNode.next = head; //link

        //step 3 = head = newNode
        head = newNode;
    }

    public void addLast (int data) { //add last
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() { //TC O(n)
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx) { //add in the middle
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1) {
            temp = temp.next;
            i++;
        }
        //i = idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeLast() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev ; i = size-2
        Node prev = head;
        for(int i = 0;i < size-2;i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public int removeFirst() { //remove First in LL
    if(size == 0) {
        System.out.println("LL is Empty");
        return Integer.MIN_VALUE;
    } else if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int itrSearch(int key) { //Iterative Seach
        Node temp = head;
        int i = 0;

        while(temp != null) {
            if(temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }

    public int helper(Node head,int key) { //helper fun is the actual recursive function
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next,key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key) {
        return helper(head,key);
    }

    public void reverse() { //reverse a linked list  TC=O(n)
        Node prev = null;
        Node curr = tail =head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

     public void deleteNthFromEnd(int n) { //FindReplaceNthEnd main question
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            sz++;
        }
        if(n == sz) {
            head = head.next; //remove first
            return;
        }
        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    //helper function for palindrome
    public Node findMiddle(Node head) { //find middle Slow fast approach
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next;//+2
        }
        return slow;//slow is my middle
    }

    public boolean checkPalindrome() {

        if(head == null || head.next == null) {
            return true;
        }
        //step 1 - find mid
        Node midNode = findMiddle(head);

        //step 2 -  reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //right half head
        Node left = head;

        //step 3 - check left half & right half
        while(right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static boolean isCycle () { //Detecting cycle in LL using Floyds cycle finding algo
        Node slow = head;
        Node fast =  head;

        while(fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2
            if(slow == fast) {
                return true; //cycle exists
            }
        }
        return false; //cycle dont exists
    }

    public static void removeCycle() { //remove cycle
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        //find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle -> last.next = null
        prev.next = null;
    }

    //merg sort in ll
    private Node getMid(Node head) { //get mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1,Node head2) { //merge
        Node mergdLL = new Node(-1);
        Node temp = mergdLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergdLL.next;
    }

    public Node mergSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }

        //find mid
        Node mid = getMid(head);

        //left & right ms
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergSort(head);
        Node newRight = mergSort(rightHead);

        //merg
        return merge(newLeft,newRight);
    }

    //Zig Zag LL
    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //alt merge - zig-zag merge
        while(left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[]) {
        LinkedList ll = new  LinkedList();
        /*ll.print();
        ll.addFirst(2); //add first in LL
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4); //last
        ll.print();
        ll.addLast(5);
        ll.print(); 
        ll.add(2,3); //add in the middle
        ll.print();*/

        //System.out.println(ll.size); //size in LL

        /*ll.removeFirst();
        ll.print();

        ll.removeLast();
        ll.print();
        System.out.println(ll.size);*/

        /*System.out.println(ll.itrSearch(3)); //Iterative search
        System.out.println(ll.itrSearch(10));

        System.out.println(ll.recSearch(3)); //recursive search
        System.out.println(ll.recSearch(10));

        ll.print();
        ll.reverse(); //reverse a ll
        ll.print();*/

        /*ll.print();
        ll.deleteNthFromEnd(3);
        ll.print();*/

        /*ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        //ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());*/

        //Detecting cycle
        /*head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        //1->2->3->1
        System.out.println(isCycle());*/
        
         //Removing cycle
        /*head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //1->2->3->2
        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());*/

        //merg sort
        /*ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        //5->4->3->2->1

        ll.print(); //TC O n(log n)
        ll.head = ll.mergSort(ll.head);
        ll.print();*/

        //zig zag LL
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        //1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();

    }
}