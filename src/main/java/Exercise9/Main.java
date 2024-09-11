package Exercise9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\Andreea\\Projects\\Java_Advanced_Coding\\src\\main\\java\\Exercise9\\Text"));

            boolean isFileEmpty = true;
            while (scanner.hasNextLine()) {
                isFileEmpty =false;
                System.out.println(scanner.nextLine());
            }
            if (isFileEmpty){
                throw new RuntimeException("File is empty");
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
