import java.util.*;
public class PrimeOrNot {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number");
        int n = SC.nextInt();

        if(n == 2) {
            System.out.print((n)+"is a prime");
        }
        else{
            boolean isPrime = true;
            for(int i = 2;i <= Math.sqrt(n);i++) {
                if(n % i == 0) { //n is a multiple of i (i not equal to 1 or n)
                isPrime = false;
            }
        }

        if(isPrime == true) {
            System.out.print((n) + "is a prime");
        }
        else {
            System.out.print((n)+"is not a prime");
        }
        }
    }
}