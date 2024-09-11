package dsa.Exercitii.Set;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class VocabularyBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SortedSet<String> vocabulary = new TreeSet<>();

        System.out.println("Enter the passage of text (type end to finish)");
        String text = scanner.nextLine();

        while (!text.equals("end")){
            String[] wordsFromText = text.split("\\s+");
            for (String it : wordsFromText){
                it = it.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (!it.isEmpty()){
                    vocabulary.add(it);
                }
            }

            text = scanner.nextLine();
        }
        System.out.println("\n Vocabulary:");
        for (String it : vocabulary){
            System.out.println(it);
        }
    }
}
