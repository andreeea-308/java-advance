package functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/*
*   Consumer = este o interfata functionala care e utilizata in general pt reprezentarea
* informatiilor
*
* In esenta preia un input, si produce un efect -> ex: afiseaza
* */

public class ConsumerExample {
    public static void main(String[] args) {
        /* Consumer that display elements of collection */
        List<String> fruits = Arrays.asList("apple", "banana", "orange");
        System.out.println("Consumer of strings: ");
        Consumer<List<String>> fruitsConsumer = it -> {
            // further filtering
            it.forEach(System.out::println);
        };
        fruitsConsumer.accept(fruits);
        System.out.println();

        /* Consumer list of numbers, remap all elements with ^3 values and display */
        System.out.println("Consumer of ints: ");
        Consumer<List<Integer>> numbersConsumer = it -> {
            for(int i = 0; i < it.size(); i++) {
                it.set(i, it.get(i) * it.get(i) * it.get(i));
            }

            it.forEach(System.out::println);
        };

        numbersConsumer.accept(Arrays.asList(1,2,3,4,5));
    }
}
