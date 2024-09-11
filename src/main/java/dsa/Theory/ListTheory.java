package dsa.Theory;

import java.util.ArrayList;
import java.util.List;

/*

 */
public class ListTheory {
    public static void main(String[] args) {
        //INITIALIZARE
        List<String> myList = new ArrayList<>();
        //ADD & ADD ALL
        myList.add("apple");  //pozitia i = 0
        myList.add("pear");   //pozitia i = 1
        myList.add("cherry");  //pozitia i = 2
        System.out.println(myList);
        myList.add(1, "banana"); //adaugare prin insertie pe un anumit index
        System.out.println(myList);
        myList.addAll(new ArrayList<>(List.of("tomato", "chilli peppers")));
        System.out.println(myList);
        myList.addAll(3, new ArrayList<>(List.of("lettucce", "cucumber")));
        System.out.println(myList);

        //GET
        System.out.println(myList.get(4));

        //REMOVE
        myList.remove("chilli peppers21");
        System.out.println(myList);
        myList.remove("chilli peppers");
        System.out.println(myList);
        myList.remove(4);
        System.out.println(myList);

        //SIZE & CLEAR & IS EMPTY
        myList.size();
        System.out.println(myList + " " + myList.isEmpty());
        myList.clear();
        System.out.println(myList);
        myList.size();
        System.out.println(myList + " " + myList.isEmpty());

        //FOR
        for (int i = 0; i < myList.size(); i++) {
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        for (String it : myList) {
            System.out.print(it + " ");
        }


    }
}
