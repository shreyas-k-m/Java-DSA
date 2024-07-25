import java.util.Arrays;
public class ClimbingStaris {

    public static int countWays(int n) { //recursion method TC = {2^n} 
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        return countWays(n - 1) + countWays(n - 2);
    }
    
    public static int countWaysmemo(int m, int ways[]) { //memoization method  TC = O(n)
        if(m == 0) {
            return 1;
        }
        if(m < 0) {
            return 0;
        }

        if(ways[m] != -1) { //already calculated
            return ways[m];
        }
        ways[m] = countWaysmemo(m - 1, ways) + countWaysmemo(m - 2, ways);
        return ways[m];
    }

    public static int countWaysTab(int o) { //tabulation 
        int dp[] = new int[o+1];
        dp[0] = 1;

        for(int i = 1; i <= o; i++) {
            if(i == 1) {
                dp[i] = dp[i-1] + 0;
            } else {
            dp[i] = dp[i-1] + dp[i-2];
            }
        }
        return dp[o];
    }

    public static void main(String[] args) {
        int n = 5; // n=3 & n=4 -> 5 => 8
        System.out.println(countWays(n));

        int m = 5;
        int ways[] = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysmemo(n, ways));

        int o = 5;
        System.out.println(countWaysTab(o));
    }
}
