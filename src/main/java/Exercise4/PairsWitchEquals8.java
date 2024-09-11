package Exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array numbers[] containing integers and another number x, print pairs of two elements from array whose sum is exactly x.
Made same operations on a List of integers and then on a Set of integers.
ex.
numbers[] = [ 5, 2, 1, -3, 8, 11, 100, -18, 4, 7, 16, 3]
x = 8
pairs:
(5, 3)
(-3, 11)
(1, 7)
 */
public class PairsWitchEquals8 {
    public static void main(String[] args) {

        int[] array = {5, 2, 1, -3, 8, 11, 100, -18, 4, 7, 16, 3};
        int targetSum = 8;
        printPairs(array, targetSum);
        System.out.println();

        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(5);
        listOfNumbers.add(3);
        listOfNumbers.add(59);
        listOfNumbers.add(8);
        listOfNumbers.add(1);
        listOfNumbers.add(0);
        printPairs(listOfNumbers, targetSum);
        System.out.println();
        printPairsWithStream(listOfNumbers, targetSum);
        System.out.println();
        printPairsEnhanceSolution(array, targetSum);
    }

    public static void printPairs(int[] array, int targetSum) {
        for (int i = 0; i < array.length; i++) {
            int numberValidation = targetSum - array[i];
            for (int j = 0; j < array.length; j++) {
                if (numberValidation == array[j] && i != j) {
                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                }
            }

        }
    }

    public static void printPairs(List<Integer> listOfNumbers, int targetSum) {
        for (int i = 0; i < listOfNumbers.size(); i++) {
            int numberValidation = targetSum - listOfNumbers.get(i);
            if (listOfNumbers.contains(numberValidation)) {
                System.out.println("(" + listOfNumbers.get(i) + ", " + numberValidation + ")");
            }
        }
    }

    public static void printPairsWithStream(List<Integer> listOfNumbers, int targetSum) {
        listOfNumbers.forEach(currentElement -> {
            if (listOfNumbers.contains(targetSum - currentElement)) {
                System.out.println("(" + currentElement + ", " + (targetSum - currentElement) + ")");
            }
        });

    }

    //BUBBLE SORT for home to learn
    public static void printPairsEnhanceSolution(int[] array, int targetSum) {
        Arrays.sort(array);
        int i = 0, j = array.length - 1;
        while (i != j) {
            if (array[i] + array[j] > targetSum) {
                j--;
            } else if (array[i] + array[j] < targetSum) {
                i++;
            } else {
                System.out.println("(" + array[i] + ", " + array[j] + ")");
                i++;
                j--;
            }
        }
    }

}
