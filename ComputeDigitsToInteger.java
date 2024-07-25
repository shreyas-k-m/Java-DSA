import java.util.Scanner;
public class ComputeDigitsToInteger {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int digits = SC.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    public static int sumDigits(int n) {
        int sumofDigits = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            sumofDigits += lastDigit;
            n /= 10;
        }
        return sumofDigits;
    }
}