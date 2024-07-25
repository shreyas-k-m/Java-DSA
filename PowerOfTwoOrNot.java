public class PowerOfTwoOrNot {
    //power of 2 always have a binary 1 at the start rest is 0

    public static boolean isPowerOfTwo(int n) {
        return (n &(n-1)) == 0;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfTwo(9));
    }
}