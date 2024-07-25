public class tilingProblem {

    public static int tiling_Problem(int n) { //2 X n(floor size)
    //base case
    if(n == 0 || n == 1) {
        return 1;
    }

    //job
    //verticle choice
    int fnm1 = tiling_Problem(n-1);

    //horizontal choice
    int fnm2 = tiling_Problem(n-2);

    int totWays = fnm1 +fnm2;
    return totWays;
    }

    public static void main(String args[]) {
        System.out.println(tiling_Problem(4));
    }
}