 public class circularQueue{
 static class Queue1 {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue1(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1; //circular queue
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add
        public static void add(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            // add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            // last element delete
            if (front == rear) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]) {
        Queue1 q = new Queue1(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove()); // 1
        q.add(4);
        System.out.println(q.remove()); // 2
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // 3, 4, 5
            q.remove();
        }
    }
}