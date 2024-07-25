import java.util.*;
public class StackProblems {
    public static void pushAtBottom(Stack<Integer> s,int data) { //push at bottom stack using recursion
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);
    }

    public static String reverseString(String str) { //reverse a string in stack
        Stack<Character> s1 = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s1.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s1.isEmpty()) {
            char curr = s1.pop();
            result.append(curr);
        }
        return result.toString();
    }

    public static void reverseStack(Stack<Integer>s2) { //reverse a stack
        //push at bottom require
        if(s2.isEmpty()) {
            return;
        }
        int top = s2.pop();
        reverseStack(s2);
        pushAtBottom(s2,top);
    }

    public static void printStack(Stack<Integer>s2) {
        while(!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }

    public static void main(String args[]) {
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    pushAtBottom(s,4);
    while(!s.isEmpty()) {
        System.out.println(s.pop());
    }

    //reverse a string in stack
    String str = "abc";
    String result = reverseString(str);
    System.out.println(result);

    //reverse a stack
    Stack<Integer> s2 = new Stack<>();
    s2.push(1);
    s2.push(2);
    s2.push(3);

    reverseStack(s2);
    printStack(s2);

    }
}