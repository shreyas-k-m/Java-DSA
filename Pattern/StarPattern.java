public class StarPattern {
    public static void main(String args[]) {
        for(int line = 1;line <= 4;line++) { //number of lines     //using nested loop
            for(int star = 1;star <= line;star++) {  //number of star
                System.out.print("*"); 
            }
            System.out.println();
        }
        {
            //invert star pattern
            int n = 4;
            for(int i = 1;i <= 4;i++) {
                for(int star = 1;star <= 4-i+1;star++) {
                    System.out.print("*"); }
                System.out.println();
                }
        }
        {
            //half pyramid
            int s = 4;
            for(int line = 1;line <= s;line++) {
                //numbers print
                for(int numbers = 1;numbers <= line;numbers++) {
                System.out.print(numbers);
                }
                System.out.println(); 
            }
        }
        {
            //character pattern
            int n = 4;
            char ch = 'A';

            //outer loop
            for(int line = 1;line <= n;line++) {
                //inner loop
                for(int chars = 1; chars <= line; chars++){
                    System.out.print(ch);
                    ch++;
                }
                System.out.println();
            }
        }
    }
}