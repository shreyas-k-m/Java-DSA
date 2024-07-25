import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
public class QueuesFramework {

    public static void main(String args[]) {
        //Queue<Integer> q = new LinkedList<>(); //using LL
        Queue<Integer> q = new ArrayDeque<>(); //using array
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); 
            q.remove();
        }
    }
}