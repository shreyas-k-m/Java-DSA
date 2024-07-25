public class printXpowN{

    public static int power(int x,int n) {
        if(n == 0) {
            return 1;
        }
        /*int xnm1 = power(x,n-1);
        int xn = x 8 xnm1
        return xn;*/

        return x * power(x,n-1);
    }

    public static int optimizedpower(int a,int n) { //optimized
    if(n == 0) {
        return 1;
    }
    int halfpowersq = optimizedpower(a, n/2) * optimizedpower(a, n/2);

    //n is odd
    if(n % 2 != 0) {
        halfpowersq = a * halfpowersq;
    }
    return halfpowersq;
    }

    public static void main(String args[]) {
        System.out.println(power(2,10));

        int a = 2;
        int n = 5;
        System.out.println(optimizedpower(a,n));
    }
}