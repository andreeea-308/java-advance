package functional_interface;

/*
 * Supplier: este o interfata functionala specializata
 * in asignarea elementor dupa anumite reguli.
 *
 * */

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<String> defaultString = () -> "Default Value!";
        String defaultString2 = "Default Value!";

        System.out.println(defaultString.get());

        Supplier<Double> randomDouble = () -> {
            // multiple prelucrari dinamica si flexibile si inteligente!

            return Math.random();
        };
        System.out.println("Random is: " + randomDouble.get());

        /* Echivalentul codului de mai sus, era sa cream o clasa, care implementeaza Supplier,
         * si care creeaza o metoda get() cu corp de implementare, ce intoarce Math.random()
         *
         * Iar in Main doar sa cream instanta clasei respective, si prin obiectul declarat, sa apelam
         * metoda get */

        /*
         *   Supplier poate functiona ca un wrapper peste orice data type.
         *   - poate primi atat valori statice, cat si dinamice in urma apelului unor metode
         *   - poate initializa blocuri de cod in care sa executam o serie de
         * comenzi premergatoare rezultatului final, care va fi asignat obiectului definit
         *   - foarte important ca in definirea operatiei lambda, trebuie sa potriviti numarul argumentelor
         * in functie de metoda din interfata SAM
         * */
    }
}
