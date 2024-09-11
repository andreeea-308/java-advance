package stream.Exercitii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Exercise 11: Mapping, FlatMapping, and Collecting to List
Given a list of lists of integers, flatten the lists into a single list of integers and collect the result into a new list.
 */
public class Ex4 {
    public static void main(String[] args) {
        List<List<Integer>> matrice2D = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );
        System.out.println("Matrice 2D:\n" + matrice2D);
        List<Integer> matrice1D = matrice2D
                .stream()
                .flatMap(it -> it.stream())     //equavalent Collection stream(Collection::stream/List::stream)
                .toList();
        System.out.println("Matrice 1D:\n" + matrice1D);
    }
}
