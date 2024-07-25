import java.util.ArrayList;
import java.util.Collections;
public class ArrayListProblems {

    public static void swap(ArrayList<Integer>list,int idx1,int idx2) {  //swap function
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>(); // syntax to create array list
        //add element
        list.add(2); // TC=O(1)
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        //reverse  TC=O(n)
        /*for(int i = list.size()-1;i>=0;i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();*/

        //find maximum TC=O(n) 
        /*int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            if(max < list.get(i)) {
                max = list.get(i);
            }
            //max = Math.max(max,list.get(i));
            System.out.println("max element = "+ max);
        }*/

        //swap function
       /* int idx1 = 1,idx2 = 3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);*/

        //inbuilt sort
        System.out.println(list);
        Collections.sort(list); //ascending
        System.out.println(list);

        //descending
        Collections.sort(list,Collections.reverseOrder()); //comprator - functions logic
        System.out.println(list);

        //multi dimensional arratlist
        /*ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> lists = new ArrayList<>();
        lists.add(1);lists.add(2);
        mainList.add(lists);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4);
        mainList.add(list2);

        for(int i = 0;i < mainList.size();i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0;j < currList.size();j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);*/

        //3 multi array
        ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> lists1 = new ArrayList<>();
        ArrayList<Integer> lists2 = new ArrayList<>();
        ArrayList<Integer> lists3 = new ArrayList<>();

        for(int i = 1;i <=5; i++) {
            lists1.add(i*1); //1 2 3 4 5
            lists2.add(i*2); // 2 4 6 8 10
            lists3.add(i*3); // 3 6 9 12 15
        }

        mainList.add(lists1);
        mainList.add(lists2);
        mainList.add(lists3);
        System.out.println(mainList);

        //nested loops
        for(int i = 0;i<mainList.size();i++) {
            ArrayList<Integer> currList = mainList.get(i);
            for(int j = 0;j < currList.size();j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}