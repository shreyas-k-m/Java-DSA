public class fibonacciRec { //recursion based

    //cal nth term of fib
    public static int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        /*int fnm1 = fib(n-1); //1
        int fnm2 = fib(n-2); //2
        int fn = fnm1 +fnm2;
        return fn;*/

        return fib(n-1) + fib(n-2);
    }

    public static void main(String args[]) {
        int n = 6;
        System.out.println(fib(n));
     }
}