import java.util.HashMap;
import java.util.Set;

public class HashMapJCF {
    
    public static void main(String[] args) {
        // create HashMap
        HashMap<String, Integer> hm = new HashMap<>();

        //insert O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        /*System.out.println(hm);

        //get O(1)
        int pupulation = hm.get("India");
        System.out.println(pupulation);

        System.out.println(hm.get("Nepal"));

        //containsKey O(1)
        System.out.println(hm.containsKey("India")); //true
        System.out.println(hm.containsKey("Nepal")); //false

        //remove O(1)
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //is empty
        hm.clear(); //clear all HashMap
        System.out.println(hm.isEmpty()); */

        //iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) { //loop on hashmap
            System.out.println("key=" +k+ ",value="+hm.get(k));
        }
    }
}
