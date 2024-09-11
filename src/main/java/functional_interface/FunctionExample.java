package functional_interface;

/*
 *   Function = este o interfata functionala care ne permite pe baza a doua tipuri de date,
 * pentru input si output, sa definim diverse portiuni de cod care sa prelucreze ceva intr-o anumita
 * forma si sa o intoarca in alta
 *
 * Scopul principa este de a face conversia dintr-un tip de date in altul, in schimb se poate utiliza si pt a prelucra
 * informatia dintr-o forma in alta.
 *
 * Nu e obligatoriu ca inputul sa fie identic vizual cu outputul.
 * */

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        /* Conversie String to Integer */
        Function<String, Integer> strToIntConversion = it -> Integer.parseInt(it);
//        Scanner scanner = new Scanner(System.in);
//        String number = scanner.nextLine();
        Integer sum = strToIntConversion.apply("1234") + 10;
        System.out.println("Conversion from String to Integer: " + sum);

        /* Conversie Integer to String */
        Function<Integer, String> intToStrConversion = it -> String.valueOf(it);
        String otherNumber = intToStrConversion.apply(51);
        System.out.println("Conversion from Integer to String: " + otherNumber);

        /* Extract size of string */
        Function<String, Integer> sizeExtractor = it -> it.length();
        System.out.println("Size of sentence: " + sizeExtractor.apply("ana are mere si fura mere din cotet"));

        /* Extragem partea intreaga */
        Function<Double, Integer> extractParteIntreaga = it -> {
            // multe alte prelucrari

            return it.intValue();
        };
        System.out.println("Parte intreaga din 12.54112 este " + extractParteIntreaga.apply(12.54112));
    }
}
