public class PrimesInARange {
    public static boolean isPrime(int n) {
        if(n == 2){
            
        }
        for(int i = 2;i <= Math.sqrt(n);i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void PrimesInARange(int n) {
        for(int i = 2;i <= n;i++) {
            if(isPrime(i)) { //true
            System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {
        PrimesInARange(20);  //2 to 20
    }
}