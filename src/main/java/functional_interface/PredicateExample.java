package functional_interface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Predicate = este o interfata functionala care ne permite sa cream reguli
 * de validare boolene pentru diverse situatii
 */

public class PredicateExample {
    public static void main(String[] args) {
        Consumer<List<Integer>> displayIntegers = it -> {
            System.out.print("Lista de numere este: ");
            it.forEach(elem -> System.out.print(elem + " "));
            System.out.println("\n");
        };

        /* Verificati paritatea elementelor din lista si extrageti doar acele numere */
        Predicate<Integer> isEven = it -> {
            return it % 2 == 0;
        };

        List<Integer> numbers = List.of(1, 3, 5, 5, 1, 24, 56, 21, 1, 23, 5, 6, 8, 9, 54);
        displayIntegers.accept(
                numbers
                        .stream()
                        .filter(isEven)
                        .toList()
        );

        /* Regex matching */
        String inputOk = "Hello, world!";
        String inputNOk = "hello, world!";
        Predicate<String> hasUpperCase = it -> it.matches(".*[A-Z].*"); // regex101.com
        System.out.println("Has uppercase letter? " + hasUpperCase.test(inputOk));
        System.out.println("Has uppercase letter? " + hasUpperCase.test(inputNOk));
        System.out.println();

        /* Class attributes validation */
        int minimumAge = 18;
        Predicate<Integer> isAdult = it -> it >= minimumAge;
        System.out.println("At 15 are you adult? " + isAdult.test(15));
        System.out.println("At 21 are you adult? " + isAdult.test(21));

        System.out.println("At 21 are you adult? " + ((21 >= minimumAge) ? true : false));
        System.out.println("At 21 are you adult? " + isAdultMethod(21));
    }

    public static boolean isAdultMethod(int age) {
        int minimumAge = 18;
        if (age >= minimumAge)
            return true;
        else
            return false;
    }
}
