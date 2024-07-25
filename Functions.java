import java.util.*;
public class Functions {
            //function/method
            /*public static void PrintHello() {
                System.out.println("HEllo world");
                System.out.println("HEllo world");
                System.out.println("HEllo world");
            }
            public static void main(String args[]) {
            PrintHello();  
            }*/
            
        //function with input
        /*public static int calculatesum(int num1,int num2) {  //parameters or formal parameter
            int sum = num1 + num2;
            return sum;
        } 
        
        public static void main(String args[]) {
            Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            int b = SC.nextInt();
            int sum = calculatesum(a,b);  //arguments or actual parameter
            System.out.println("sum is : " + sum); } */

        // product od a * b
        /*public static int multiply(int a,int b) {
            int product = a * b;
            return product;
        }
        public static void main(String args[]) {
            int a = 3;
            int b = 5;
            int prod = multiply(a,b);
            System.out.println(prod);
        }*/
        /*public static void swap(int a,int b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println(a);  //function should be printed in void not in main
            System.out.println(b);
        }
        public static void main(String args[]) {
            //call by value (swap)
            int a = 5;
            int b = 8;
            swap(a,b);
        } */  

    //factorial of a number    
    /*public static int multiply(int a,int b) {
        int product = a * b;
        return product;
    }

    public static int factorial(int n) {
        int f = 1;

        for(int i = 1;i <=n;i++) {
            f = f * i;
        }
        return f; //factorial of n
    }

    public static void main(String args[]) {
        System.out.println(factorial(4));
    }*/

    //Binomial Coefficient
    /*public static int factorial(int n) {
        int f = 1;

        for(int i = 1;i <=n;i++) {
            f = f * i;
        }
        return f; //factorial of n
    }

    public static int binCoeff(int n,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

        public static void main(String args[]) {
            System.out.println(binCoeff(5, 2));
        }*/

        //function overloading using parameter
        /*public static int sum(int a,int b) {  //cal sun of 2 no
            return a + b;
        }

        public static int sum(int a,int b,int c) {  //cal sun of 3 no
            return a + b + c;
        }

         public static void main(String args[]) {
            System.out.println(sum(5, 2));
            System.out.println(sum(5, 2, 1));
        }*/

        //function overloading using data types
        /*public static int sum(int a,int b) {  //cal sun of 2 no using int
            return a + b;
        }

        //function overloading using parameter
        public static float sum(float a,float b) {  //cal sun of 2 no using float
            return a + b;
        }

        public static void main(String args[]) {
            System.out.println(sum(5, 2));
            System.out.println(sum(5.2f, 4.8f));
        }*/

        
}