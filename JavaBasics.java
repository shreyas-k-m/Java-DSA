import java.util.*;
public class JavaBasics {
    public static void main(String args[]) {

        System.out.print("Hello Shreyas!\n");

        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");

        {
            //Sum of two numbers
            int a=8,b=2,sum;
            sum = a+b;
            System.out.println(sum);
        }

        {
            Scanner SC = new Scanner(System.in);
            //String input = SC.next();
            //System.out.println(input);

            //String Name = SC.nextLine();
            //System.out.println(Name);

            //int Number = SC.nextInt();
            //System.out.println(Number);

            //float price = SC.nextFloat();
            //System.out.println(price);
        }

        {
            //sum of two numbers using user input
            /*Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            int b = SC.nextInt();
            int sum = a + b;
            System.out.println(sum);*/
        }
        {
            //product of a and b
            /*Scanner SC = new Scanner(System.in);
            int a = SC.nextInt();
            int b = SC.nextInt();
            int product = a * b;
            System.out.println(product);*/
        }
        {
        //area of the circle
        /*Scanner SC = new Scanner(System.in);
        float radius = SC.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);*/
        }

        {
            //arithmetic operation (binary)
            int A = 10,B = 5;
            System.out.println("add = " + (A+B));
            System.out.println("sub = " + (A-B));
            System.out.println("mul = " + (A*B));
            System.out.println("div = " + (A/B));
            System.out.println("modulo = " + (A%B));
        }
        {
             //arithmetic operation (unary)
            int A = 10; 
            int B = ++A; //preincrement
            System.out.println(A);
            System.out.println(B);
        }
        {
             //arithmetic operation (unary)
            int A = 10;
            int B = A++; //postincrement
            System.out.println(A);
            System.out.println(B);
        }
        {
             //relational operation
            int A = 10;
            int B = 5;
            System.out.println(A==B); //equals  to
            System.out.println(A!=B); //not equals  to
            System.out.println(A==B); //equals  to
            System.out.println(A>B); //greater
            System.out.println(A<B); //lesser
            System.out.println(A>=B); //greater than equals
            System.out.println(A<=B); //lesser than equals
        }
        {
             //logical operator
             System.out.println( (5>2) && (10>5)); //and
             System.out.println( (5<2) && (10>5));
             System.out.println( (5<2) || (10>5)); //or
             System.out.println( (5<2) && (10<5));
             System.out.println( !(5<2) ); //not
             System.out.println( !(5>2) );
        }
        {
         //conditional statement
         int age = 13;
         if(age >= 18) { //if else statement
            System.out.println("adult : drive,vote");
         }
         if(age >= 13 && age <18){
            System.out.println("teenager");
         }
         else {
            System.out.println("not adult");
         }
        }
        {
         int age = 22;
         if(age >= 18) { //else if statement
            System.out.println("adult : drive,vote");
         }
         else if(age >= 13 && age <18){
            System.out.println("teenager");
         }
         else {
            System.out.println("not adult");
         }
        }
        {
            int number = 5;
            //ternary operator
            String type = ((number % 2) == 0) ? "even" : "odd";
            System.out.println(type);
        }
        {
            int marks = 67;
            //ternary operator
            String reportcard = marks >=33 ? "PASS" : "FAIL";
            System.out.println(reportcard);
        }
        {
            int number = 3;
            switch(number) {
                case 1 : System.out.println("samosa");
                break;
                case 2 : System.out.println("burger");
                break;
                case 3 : System.out.println("mango"); 
                break;
                default : System.out.println("wake me up");
            }
        }
        {
            //While Loop
            int counter = 0;
            while(counter < 5) {
                System.out.println("Hello World!");
                counter++;
            }
        }
        {
            //print no. from 1 to 10 using while loop
            int counter = 1;
            while(counter <= 10) {
                System.out.print(counter + " \n");
                counter++;
            }
        }
        {
            /*print no. from 1 to n using while loop
            Scanner SC = new Scanner(System.in);
            int range = SC.nextInt();
            int counter = 1;

            while(counter <= range) {
                System.out.print(counter + " ");
                counter++;
            }*/
        }
        {
            /*sum of 1st n natural no.
            Scanner SC = new Scanner(System.in);
            int n = SC.nextInt();
            int sum = 0;

            int i = 1;
            while(i <= n) {
                sum = sum+i;
                i++;
            }
            System.out.print(sum + " "); */
        }
        {
            //for loop
            //int i = 1;
            for(int i = 1;i <= 5;i++) {
                System.out.println("Hello World!");
            }
        }
        {
            //print square pattern
            for(int lines = 1;lines <=4;lines++)
            System.out.println("****");
        }
        {
            int counter = 1;
            do {
                System.out.println("hello world!");
                counter++;
            }
            while(counter <= 3);
        }
        {
            //break statement
            for(int i = 1;i <= 5;i++) {
                if(i == 3) {
                    break;
                }
                System.out.println(i);
            }
            System.out.println("i am out of the loop");
        }
        {
            //continue statement
            for(int n =1;n <=5;n++) { 
                if (n == 3)
                {
                    continue;
                }
                System.out.print(n);
            }
        }
    }
}