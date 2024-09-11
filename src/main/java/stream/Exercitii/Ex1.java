package stream.Exercitii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Exercise 6: Filtering, Mapping, Reducing to Single Value
Given a list of integers, filter out the even numbers, map them to their squares, and calculate the sum of the squares.
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose a dimention: ");
        int dimention = scanner.nextInt();
        System.out.println("Choose numbers: ");
        List<Integer> list = new ArrayList<>(dimention);
        for (int i = 0; i < dimention; i++) {
            list.add(scanner.nextInt());
        }
        System.out.println(list);
        System.out.println("Stream iterations: ");
        Double sum = list
                /* Operatie de conversie */
                .stream()
                /* Operatie intermediare */
                .filter(it -> it % 2 == 0)
                .peek(it -> System.out.print(it + " "))
                .map(it -> Math.pow(it, 2.0))
                .peek(it -> System.out.print(it + "\n"))
                /* Operatie de reductie */
                .reduce(0.0, Double::sum);
        System.out.println("\nThe sum is: " + sum);
    }
    
}
