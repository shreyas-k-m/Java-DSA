public class OddOrEven {

    public static void Odd_Or_Even(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String args[]) {
        Odd_Or_Even(3);
        Odd_Or_Even(12);
    }
}