import java.util.*;
public class Arrays {
    /*public static void main(String args[]) {
        //creating a array
        {
            int mark[] = new int[50];

        int numbers[] = {1,2,3};

        String fruits[] = {"apple","mangpo"};
        }

        {
        //input&output
        int marks[] = new int[100];

        Scanner SC = new Scanner(System.in);

        marks[0] = SC.nextInt();
        marks[1] = SC.nextInt();
        marks[2] = SC.nextInt();

        System.out.println("phy "+ marks[0]);
        System.out.println("chem "+ marks[1]);
        System.out.println("math "+ marks[2]);

        //update markss
        marks[2] = 100;
        System.out.println("math "+ marks[2]);

        //percentage
        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage "+ percentage + "%");

        System.out.println("length of array =  "+ marks.length);
        }
    }*/

    /*{
    //array as function arguments bu using call by reference
    public static void update(int marks[]) {
        for(int i = 0;i<marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main (String args[]) {
        int marks[] = {97,98,99};
        update(marks);

        //print marks
        for(int i = 0;i<marks.length;i++) {
            System.out.print(marks[i]+" ");
        }
    }
    }*/
    
    
        //Linear search
        /*public static int linearSearch(int numbers[],int key) {

            for(int i = 0;i < numbers.length;i++) {
            if(numbers[i] == key) {
                return i;
            }
        }
        return -1;
        }

        public static void main (String args[]) {
            int numbers [] = {2,4,6,8,10,12,14,16};
            int key = 20;

            int index = linearSearch(numbers,key);
            if(index == -1) {
                System.out.println("Not FOund");
            }
            else {
                System.out.println("Key is at index : "+index);
            }
        }*/

        //largest number in a array 
        /*public static int getLargest(int numbers[]) {
            int largest = Integer.MIN_VALUE; //-infinity
            int smallest = Integer.MAX_VALUE;

            for(int i = 0;i < numbers.length;i++) {
                if(largest < numbers[i]) {
                    largest = numbers[i];
                }
                if (smallest > numbers[i]) {
                    smallest = numbers[i];
                }
            }
            System.out.println("Smallest Value is : "+ smallest);
            return largest;
        }

        public static void main (String args[]) {
            int numbers [] = {2,4,6,8,10,12,14,16};
            System.out.println("Largest Value is : "+ getLargest(numbers));
        }*/


        //reverse an array
        public static void reverse(int numbers[]) {
            int first = 0,last = numbers.length-1;

            while(first < last) {
                //swap
                int temp = numbers[last];
                numbers[last] = numbers[first];
                numbers[first] = temp;

                first++;
                last--;
            }
        }

        public static void main (String args[]) {
            int numbers [] = {2,4,6,8,10,12,14,16};

            reverse(numbers);
            for(int i = 0;i < numbers.length;i++) {
                System.out.print(numbers[i]+" ");
            }
            System.out.println();
        }

        public static void fill(int[] ways, int i) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'fill'");
        }
}