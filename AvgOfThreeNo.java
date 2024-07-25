import java.util.Scanner;
public class AvgOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the first no. : ");
        double x = sc.nextDouble();
        System.out.println("input the second no. : ");
        double y = sc.nextDouble();
        System.out.println("input the third no. : ");
        double z = sc.nextDouble();
        System.out.println("The average value is " + average(x,y,z) + "\n");
    }

    public static double average(double x,double y,double z) {
        return(x+y+z) / 3;
    }
}