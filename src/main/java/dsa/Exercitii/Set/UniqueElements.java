package dsa.Exercitii.Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> uniqueElementsSet = new HashSet<>();

        System.out.println("Enter the number of elements: ");
        int setSize = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter elements: ");
        for (int i = 0; i < setSize; i++) {
            String temp = scanner.nextLine();
            uniqueElementsSet.add(temp);
        }

        System.out.println("Unique elements: ");
        for (String it : uniqueElementsSet) {
            System.out.println(it + " ");
        }
    }
}
