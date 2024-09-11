package functional_interface;

import java.util.Comparator;
import java.util.concurrent.*;

/**
 * SAM = Single Abstract Method
 * - reprezinta o serie de interfete care contin EXACT o metoda
 * - ele au un rol crucial in utilzarea operatiilor lambda in diverse contexte
 * - exemple de SAM:
 *      -- printre cele mai vechi: Runnable, Callable, Comparator
 *      -- printre cele mai noi (venite odata cu Java 8): Supplier, Function, Predicate si Consumer
 *
 *   Toate interfetele functionale sunt de 3 tipuri:
 *      1. IF Nule      -> 0 argumente in metoda SAM    (Supplier, Callable, Runnable)
 *      2. IF Unare     -> 1 argument in metoda SAM     (Consumer, Predicate)
 *      3. IF Binare    -> 2 argumente in metoda SAM    (Function, Comparator)
 *
 *   Pentru ca in functie de tipologia interfetei, va definiti operatia lamba diferit:
 *      1. () -> {code}
 *      2. (it) -> {code}
 *      3. {a,b} -> {code}
 *
 *   In definitia metodie SAM, argumentele reprezinta categoria (nul, unar, binar) si tipul de date al input-ului,
 *   iar return type-ul metodei reprezinta tipul de date al output-ului
 *      1. nu aveti argumente () -> {return type-ul metodei}
 *      2. 1 argument de tipul de date al interfetei (it) -> {return type-ul metodei}
 *      3. 2 argument de tipul de date al interfetei {a,b} -> {return type-ul metodei}
 *
 *   Concluzia este ca operatiile lambda in contextul folosirii interfetelor functionale sunt o modalitate custom (personalizata)
 *   de a defini obiecte care se comporta ca niste metode.
 */

public class MySAM {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /* Runnable = permite executarea operatiilor asincrone -> ajuta la paralelizare */
        Runnable task = () -> {
            // I-am spus CPU-ului ca aceasta portiune de cod este executata SEPARAT de un thread (instanta procesorului logic)
            System.out.println("Executing task asynchronously");
        };

        Thread thread = new Thread(task);
        thread.start();

        /* Callable = se ocupa de exception handling */
        Callable<Integer> callableTask = () -> {
            Thread.sleep(4000);

            // returns computed result
            return 42;
        };

        // Cream un executor pt un singur thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        // Inregistreaza taskul ca munca viitoare pt un thread
        Future<Integer> futureResult = executorService.submit(callableTask);

        // Alte operatii computationale ...

        // Cerem rezultatul
        Integer result = futureResult.get();
        System.out.println(result);

        // Inchidem executorul ca sa nu ramana procesul deschis
        executorService.shutdown();

        /* Comparator = reprezinta o modalitate functionala de a compara doua obiecte intre ele pe baza unei ordini custom */
        Comparator<String> lenghtComparator = (it1, it2) -> Integer.compare(it1.length(), it2.length());

        System.out.println(lenghtComparator.compare("ana are mere", "andrei"));
        System.out.println(lenghtComparator.compare("andrei", "andrei"));
        System.out.println(lenghtComparator.compare("andrei", "andrei are mere"));
    }

    /*
    Interfata functionala ne permite sa cream obiecte care sa se comporte ca niste metode. Folosind obiectul, putem
    apela functionalitatea singulara a interfetei pt a aplicat regula pe care o seteaza.
     */

}