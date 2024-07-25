import java.util.*;
public class calculator {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = SC.nextInt();
        System.out.println("enter b : ");
        int b = SC.nextInt();
        System.out.println("enter operator : ");
        char operator = SC.next().charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("wrong operator");
        }
    }
}