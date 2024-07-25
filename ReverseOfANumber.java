public class ReverseOfANumber {
    public static void main(String args[]) {
        int n = 10899;

        while(n > 0) {
            int lastdigit = n % 10;  //to get last digit n%10
            System.out.print(lastdigit);
            n = n /10;              //to remove last digit n/10;
        }

        {
            int m = 10899;
            int rev = 0;

            while(m > 0) {
            int lastdigits = m % 10;  //to get last digit n%10
            rev = (rev*10) + lastdigits;
            m = m/10;              //to remove last digit n/10;
            System.out.print(rev);
            }
        }
    }
}