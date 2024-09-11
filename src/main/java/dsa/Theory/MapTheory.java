package dsa.Theory;

import java.util.*;

/*

 */
public class MapTheory {
    public static void main(String[] args) {
        Map<String, Integer> myHashMap = new HashMap<>(Map.of("Jonh", 25, "Alice", 30, "Bob", 28));
        System.out.println(myHashMap);

        myHashMap.put("Jianu", 89);
        System.out.println(myHashMap);
        myHashMap.putAll(Map.of("Matei", 56, "John", 25, "Bob", 99));
        System.out.println(myHashMap);

        myHashMap.putIfAbsent("Matei", 67);
        myHashMap.putIfAbsent("Maria", 68);
        System.out.println(myHashMap);

        System.out.println(myHashMap.get("Jianu"));

        System.out.println(myHashMap.remove("Matei"));
        System.out.println(myHashMap);
        System.out.println(myHashMap.remove("Bob", 99));
        System.out.println(myHashMap.remove("Ardeal", 99));
        System.out.println(myHashMap.remove("Alice", 99));
        System.out.println(myHashMap);

        System.out.println(myHashMap.values());
        System.out.println(myHashMap.keySet());

        Set<Map.Entry<String, Integer>> coversionMapToSet = myHashMap.entrySet();
        System.out.println(coversionMapToSet);

        System.out.println(myHashMap.containsKey("Jianu"));
        System.out.println(myHashMap.containsValue(30));

        SortedMap<Integer, String> mySortedMap = new TreeMap<>();
        mySortedMap.put(124, "Carnati");
        mySortedMap.put(98, "Scoici");
        mySortedMap.put(11, "Paini");
        mySortedMap.put(2, "Sticle de apa");

        for(SortedMap.Entry<Integer, String> it: mySortedMap.entrySet()){
            System.out.println(it.getKey() + " -> " + it.getValue());
        }

        System.out.println(mySortedMap.lastKey());
        System.out.println(mySortedMap.firstKey());
        System.out.println(mySortedMap.headMap(50));
        System.out.println(mySortedMap.tailMap(50));
        System.out.println(mySortedMap.subMap(10, 90));
    }
}
