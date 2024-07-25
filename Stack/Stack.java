import java.util.*;
public class Stack {

    static class Stack1 { //stack using arraylist
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty() {
            return list.size() == 0;
        }

        //push
        public static void push(int data) {
            list.add(data);
        }

        //pop
        public static int pop() {
            if(isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size()-1);
            return top;
        }

        //peek
        public static int peek() {
             if(isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
        }
    }

    static class Stack2 { //stack using LinkedList
        static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class Stack2b {
            static Node head = null;

            public static boolean isEmpty() {
                return head == null;
            }

            //push
            public static void push(int data) {
                Node newNode = new Node(data);

                if(isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            //pop
            public static int pop() {
                if(isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            //peek
            public static int peek() {
                if(isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }
    }

    public static void main(String args[]) {
        //stack using arraylist
        Stack1 s = new Stack1();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
       
        //stack using LinkedList
        Stack2.Stack2b s1 = new Stack2.Stack2b();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        while(!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}