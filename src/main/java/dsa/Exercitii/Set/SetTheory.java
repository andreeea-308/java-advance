package dsa.Exercitii.Set;

import java.util.*;

/*

 */
public class SetTheory {
    public static void main(String[] args) {
        //INITIALIZARE
        Set <String> myHashSet = new HashSet<>();

        //ADD
        myHashSet.add("apple");
        myHashSet.add("pear");
        myHashSet.add("cherry");
        System.out.println(myHashSet);
        myHashSet.add("apple");
        System.out.println(myHashSet);
        myHashSet.addAll(new HashSet<>(Set.of("apple", "banana")));
        System.out.println(myHashSet);

        //REMOVE
        myHashSet.remove("apple");
        System.out.println(myHashSet);
        myHashSet.remove("apple");
        System.out.println(myHashSet);

        //CONTAINS
        System.out.println(myHashSet.contains("apple"));
        System.out.println(myHashSet.contains("cherry"));

        //CONVERT SET <-> LIST
        List<Integer> numberList = new ArrayList<>(List.of(1, 5, 1, 11, 6, 32, 124, 6, 4, 6, 6235, 622, 34, 4, 11));
        Set<Integer> uniqueNumberList = new HashSet<>(numberList);
        System.out.println(uniqueNumberList);

        //SORTED SET
        SortedSet <Double> mySortedSet = new TreeSet<>(Set.of(1.0, 5.0, 11.0, 6.0, 32.0, 124.0, 6235.0, 622.00, 34.0, 4.0));
        System.out.println(mySortedSet);

        //
        System.out.println(mySortedSet.headSet(10.0));
        System.out.println(mySortedSet.tailSet(25.0));

        System.out.println(mySortedSet.first() + " " + mySortedSet.last());

        //SUB SET
        System.out.println(mySortedSet.subSet(6.0, 33.0));
    }
}
