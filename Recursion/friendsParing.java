public class friendsParing {

    public static int friendsParings(int n) {

        //base
        if(n == 1 || n == 2) {
            return n;
        }

        /*//choice single
        int fnm1 =friendsParings(n-1);

        //pair
        int fnm2 = friendsParings(n-1);
        int pairWays = (n-2) * fnm2;

        //totways
        int totWays = fnm1 + pairWays;
        return totWays;*/

        return friendsParings(n-1) + (n-1) * friendsParings(n-2);
    }
    public static void main(String args[]) {
        System.out.println(friendsParings(3));
    }
}