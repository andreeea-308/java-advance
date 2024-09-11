package oop.Principle;

/*
    Polymorphismul permite obiectelor din diferite clase sa fie tratate asemeni clasei
    in care sunt suprascrise(override) sau supraincarcate(overload).

    Override:
        - se asigura prin folosirea adnotarii @Override
        - suprascrierea ne permite sa oferim  implementari specifice metodelor din clasa parinte in clasa copil
        - o putem considera o supraspecializare a metodei, find ca ea va avea 2 implementari actionate pe tipuri de date diferite
        - PENTRU EXEMPLE:
            -- verificare clasa AbstractionPrinciples for Override from interferce
            -- verificare clasa InheritancePrinciples for Override from parent class

    Overload:
        - permite ca mai multe metode sa aiba acelasi nume, dar parametrizare diferita
        - blocul de cod de implementare POATE fi sau nu sa fie alterat, in general se pastreaza logica
        - nu exsta niciun fel de adnotare

    Diferente:
        - spectru de aplicabilitate al override-ului este pe toate nivelele de mostenire,
        in timp ce la overload e doar in clasa curenta
        - override pastreaza integral semnatura metodei, se schimba implementarea
        - overload pastreaza doar numele, in rest parametrizarea, return type-ul sau chiar si implementarea se pot schimba
 */

class Calculator {
    // adunare pentru numere intregi
    int add(int a, int b) {
        return a + b;
    }

    // adunare pentru numere reale
    double add(double a, double b) {
        return a + b;
    }
}

public class PolymorphimsPrinciples {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.add(4.5, 4.2));
    }
}
