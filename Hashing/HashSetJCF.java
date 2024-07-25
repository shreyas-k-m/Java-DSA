import java.util.HashSet;
import java.util.Iterator;

public class HashSetJCF {
    
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(2);
        set.add(1);

        System.out.println(set);

        System.out.println(set.size());

        System.out.println(set.isEmpty());

        set.remove(1);
        System.out.println(set);

        if(set.contains(2)) {
            System.out.println("set contains 2");
        }

        set.clear();
        System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");

        Iterator it = cities.iterator(); //using iterator in hashset
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for(String city : cities) { //advanced for loop
            System.out.println(city);
        }
    }
}
