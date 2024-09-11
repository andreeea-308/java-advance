package dsa.Exercitii.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Map<String, Integer> wordFrequency = countWordFrequency(sentence);

        for (Map.Entry<String, Integer> it : wordFrequency.entrySet()) {
            System.out.println(it.getKey() + " " + it.getValue());
        }
    }

    private static Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        String[] splittedSentence = sentence.split("\\s+");
        for (String word : splittedSentence) {
            if (result.containsKey(word)) {
                result.put(word, result.get(word) + 1);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }
}
