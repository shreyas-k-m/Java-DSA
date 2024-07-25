import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetJCF {


    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>(); //LHS will print in order
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        System.out.println(lhs);

        System.out.println(lhs.size());

        System.out.println(lhs.isEmpty());

        if(lhs.contains("Noida")) {
            System.out.println("set contains");
        }

        lhs.remove("Delhi");
        System.out.println(lhs);

        Iterator it = lhs.iterator(); //using iterator in hashset
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : lhs) { //advanced for loop
            System.out.println(city);
        }
    }
}
