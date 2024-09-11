package dsa.Exercitii.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> stringSet1 = new HashSet<>();
        Set<String> stringSet2 = new HashSet<>();

        System.out.println("Enter text for set1: ");
        String[] splittedStringSet1 = scanner.nextLine().split("\\s+");
        for (String it : splittedStringSet1) {
            stringSet1.add(it.replaceAll("[^a-zA-Z]", "").toLowerCase());
        }

        System.out.println("Enter text for set2: ");
        String[] splittedStringSet2 = scanner.nextLine().split("\\s+");
        for (String it : splittedStringSet2) {
            stringSet2.add(it.replaceAll("[^a-zA-Z]", "").toLowerCase());
        }

        Set<String> commonStringElements = new HashSet<>(stringSet1);
        commonStringElements.retainAll(stringSet2);
        System.out.println("\nThe common word were: ");
        for (String it : commonStringElements) {
            System.out.println(it);
        }
    }
}
