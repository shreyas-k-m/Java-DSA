import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        System.out.println("Enter a number : ");
        Scanner SC = new Scanner(System.in);
        int palindrome = SC.nextInt();

        if(ispalindrome(palindrome)) {
            System.out.println("Number " + palindrome + " is a palindrome");
        }
        else {
            System.out.println("Number " + palindrome + " is not a palindrome");
        }
    }

    public static boolean ispalindrome(int number) {
        int palindrome = number;
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 +remainder;
            palindrome = palindrome / 10;
        }

        if (number == reverse) {
            return true;
        }
        return false;
    }
}