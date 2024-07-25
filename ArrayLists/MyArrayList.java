import java.util.ArrayList;

public class MyArrayList {

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // syntax to create array list
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        //add element
        list.add(1); // TC=O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9); //adding direct to index TC=O(n)

        System.out.println(list);
        System.out.println(list.size()); //size 

        //print the arraylist
        for(int i = 0;i < list.size();i++) {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        //get operation  TC=O(1)
        int element = list.get(2);
        System.out.println(element);

        //remove element TC=(n)
        list.remove(2);
        System.out.println(list);

        //set element at index  TC=0(N)
        list.set(2,10);
        System.out.println(list);

        //contains element TC= 0(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}