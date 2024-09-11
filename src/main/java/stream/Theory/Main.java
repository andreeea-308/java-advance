package stream.Theory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 Stream API = sunt o interfata care expun o serie de functii ce se ocupa de prelucrarea si reprezentarea colectiilor in diverse forme
    !! Stream-urile nu definesc tipuri de date finale, ci intermediare !!

    Streamurile sunt o referinta la locatia de memorie unde sunt stocate elementele colectiei

    Avantaje:
        - posibilitatea utilizarii paradigmei de programare functionala prin Lambda
        - timpi de rulare mult mai mici
        - memorie redusa
        - dimensiuni de implementare reduse

    Streamurile folosesc in parcurgerea elementelor conceptul de iterator -> adica nu vom avea control asupra pozitiei elementelor
 */
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Charlie", "Alice", "Eve", "David", "Bob"));
        List<Integer> numbers = new ArrayList<>(Arrays.asList(3, 1, 5, 2, 4));

        /*-------------------------------------- Operatii conversie (Pas 1) --------------------------------------*/
        // Primul pas in utilizarea streamurilor este conversia temporara la stream
        Stream<String> streamNames = names.stream();

        /*-------------------------------------- Operatii intermediare (Pas 2) --------------------------------------*/
        /* Filter = este echivalentul verificarii conditionale booleane (if) */
        System.out.print("Algoritm iterativ de filtrare: ");
        for (String it : names) {
            if (it.length() == 3) {
                System.out.print(it + " ");
            }
        }
        System.out.println();

        List<String> threeLettersNames = names
                // Pasul 1: CONVERSIA DE LA COLLECTION LA STREAM
                .stream()
                // PASUL 2: PRELUCRAREA ELEMENTELOR PRIN ITERATOR (multiple prelucrari)
                .filter(it -> it.length() == 3)
                // PASUL 3: COLECTAREA REZULTATELOR IN sub colectii sau rezultate singulare (reductie)
                .toList();
        System.out.println("Algoritm functional de filtrare: " + threeLettersNames + "\n");

        /* Map = este utilizat pt reasignarea elementelor cu noi valori (actualizare) */
        System.out.print("Algoritm iterativ de mapare: ");
        for (String it : names) {
            it = it.toUpperCase();  //suprascriem valoarea veche
            System.out.print(it + " ");
        }
        System.out.println();

        List<String> capitalisedNames = names
                .stream()
                .map(it -> it.toUpperCase())
                .toList();
        System.out.println("Algoritm functional de mapare: " + capitalisedNames + "\n");

        /* Sorted = este utilizat pentru a sorta */
        List<String> sortedNamesAscending = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Algoritm functional de sortare ascendenda: " + sortedNamesAscending);

        List<Integer> sortedNumberDescending = numbers
                .stream()
                .sorted((a, b) -> b.compareTo(a)) // sau Comparator.reverseOrder()
                .collect(Collectors.toList());
        System.out.println("Algoritm functional de sortare descendenta: " + sortedNumberDescending + "\n");

        /* Distinct = este utilizat pt creearea unei sub colectii de elemente unice (similar cu conversia de la List la Set) */
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 4, 1, 2, 3, 4, 5, 2, 1, 23, 4, 5, 1, 24, 5, 5, 12, 42, 1, 2124);

        List<Integer> uniqueNumbers = numbersWithDuplicates
                .stream()
                .distinct() // pe langa faptul ca intoarce toate elementele unice, pastreaza ordinea lor din lista (a primelor aparitii)
                .collect(Collectors.toList());
        System.out.println("Algoritm functional de eliminare a duplicatelor: " + uniqueNumbers + "\n");

        /*-------------------------------------- Operatii terminale (Pas 3) --------------------------------------*/
        /* Reduce = de regula folosit in loc de a colecta rezultatul intr-o sub colectie, adesea pt a reduce sub
        colectia la un rezultat singular */
        int sum = 0;
        for (Integer it : numbers) {
            sum += it;
        }
        System.out.println("Suma elementelor iterativ: " + sum);

        sum = numbers
                // Pas 1: conversie
                .stream()
                // Pas 2: prelucrare (nu avem)
                // Pas 3: reducem toata colectia la un rezulat int pe baza UNEI REGULI (operatia matematica de suma)
                .reduce(0, (a, b) -> Integer.sum(a, b));
        System.out.println("Suma elementelor functional: " + sum + "\n");
    }

}
