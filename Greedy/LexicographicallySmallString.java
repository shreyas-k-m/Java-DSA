import java.util.Arrays;

public class LexicographicallySmallString {
    
    public static char[] lexo_small(int n, int k) {
        char arr[] = new char[n];
        Arrays.fill(arr, 'a');
        
        for (int i = n - 1; i >= 0; i--) {
            k -= (i + 1);
            if (k >= 0) {
                if (k >= 25) {
                    arr[i] = 'z';
                    k -= 25;
                } else {
                    arr[i] = (char) ('a' + k);
                    k = 0;
                }
            } else {
                k += (i + 1);
                break;
            }
        }
        
        return arr;
    }
    
    public static void main(String[] args) {
        int n = 5, k = 42;
        char arr[] = lexo_small(n, k);
        System.out.println(new String(arr));
    }
}
