package exceptions;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/*

 */
public class ExceptionTheory {
    public static void main(String[] args) throws IOException {
        //Exemplu 1 -> try catch
        try {
            sleepAndOpenFile("my_file_path");
        } catch (FileNotFoundException | InterruptedException e) {
            //mai poti face operatiuni inainte de a arunca exceptia - soft handling, daca nu faci throw
            System.out.println(e.getStackTrace());
            System.out.println();
            System.out.println(e.getCause());
            System.out.println();
            System.out.println(e.getMessage());
//            throw new FileNotFoundException("Ai facut buba");  //daca faceti throw
        }
        System.out.println();
        //Exemplu 2 -> try with multiple catch
        try {
            Thread.sleep(-100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println();
        //Exemplu 3 -> try with hierarchy catch
        try {
            final KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            final Cipher cipher = Cipher.getInstance("AES");
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Numele algoritmului e incorect!");
        } catch (NoSuchPaddingException e) {
            System.err.println("Oops");
        } catch (Exception e) {
            System.err.println("Generic exception");
        }
        System.err.println();
        //Exemplu 4 -> try catch finally
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("my_beauty_path"));
        } catch (IOException e) {
            System.err.println("Am incercat sa citim un fisier de la un anumit path si am esuat!");
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
        }
    }

    public static void sleepAndOpenFile(String filePath) throws InterruptedException, FileNotFoundException {
        Thread.sleep(4000);
        System.out.println("We waited 4 seconds");
        new FileReader(filePath);
    }
}
