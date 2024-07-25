public class SumNaturalRecursion {

    public static int calSum(int n) { //O(n)
        if(n ==1) {
            return 1;
        }
        int snm1 = calSum(n-1);
        int Sn = n + snm1;
        return Sn;
    }

     public static void main(String args[]) {
        int n = 5;
        System.out.println(calSum(n));
     }
}