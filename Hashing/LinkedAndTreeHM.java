import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedAndTreeHM {
    
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); //Linked HashMap printed by order
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        System.out.println(lhm);

        TreeMap<String, Integer> tm = new TreeMap<>(); //tree map printed by alphabetic order (Sorted) keys
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("US", 50);
        tm.put("Indonesia", 6);

        System.out.println(tm);
    }
}
