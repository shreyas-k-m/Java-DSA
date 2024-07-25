import java.util.*;
public class EvenOrOdd {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the number");
        int Number = SC.nextInt();

        if(Number % 2 == 0) {
            System.out.println("EVEN");
        }
        else {
            System.out.println("ODD");
        }
    }
}