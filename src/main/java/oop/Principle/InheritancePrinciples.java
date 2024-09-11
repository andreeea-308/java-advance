package oop.Principle;
/*
    Mostenirea = ne permite sa preluam informatii generale dintr-o clasa parinte in mai multe clase copil.Informatiile generale
    pot fi atat atribuite, cat si metode de compotament.

    E un best practice pentru ca:
        -- reutilizarea codului
        -- e mult mai usor de extins in complexitate
        -- timp si efort redus
        -- organizare mai buna pe module mai mici

    this = este pointer la instanta locala a clasei (la atributul clasei)
    Multilevel inheritance = mostenirea pe mai multe nivele = fiecare copil devine parinte la randul lui pt alte clase mostenite
    Multilevel inheritance = NU EXISTA IN JAVA LA NIVEL DE CLASA
        --se poate simula prin implementarea multipla de interfete! -> class Child extends Parent implements I1, I2, I3, I4, .....

    Keywords extends:
        -- e mecanismul prin care putem realiza mostenirea

    EXTENDS se foloseste exclusiv pt mostenirea intre clace
    IMPLEMENTS se foloseste exclusiv pt implementarea contractului de metode `


 */

class Mammels {
    int age;
    String colour;
    String species;

    Mammels(int age, String colour, String newSpecies) {
        this.age = age;
        this.colour = colour;
        this.species = newSpecies;
    }
    void displyDetails() {
        System.out.println(this.species + " " + this.age + " " + this.colour );
    }
    void sound() {
        System.out.println("Mammels make sound");
    }

    void displyDetailsOverriden() {}
}

class Tiger extends Mammels {
    String food;

    Tiger(int age, String colour, String newSpecies, String food) {
        super(age, colour, newSpecies);
        this.food = food;
    }
    void displyDetails() {
        System.out.println(this.species + " " + this.age + " " + this.colour + " " + this.food);
    }

    @Override
    void displyDetailsOverriden() {
        super.displyDetailsOverriden();
        System.out.println(this.food);
    }

    @Override
    void sound() {
        super.sound();
        System.out.println(super.species);
        System.out.println("Tiger roars");
    }
}
public class InheritancePrinciples {
    public static void main(String[] args) {
        Mammels mammel = new Mammels(10, "red", "monkey");
        Mammels whiteTiger = new Tiger(10, "white", "siberian tiger", "lots of meat");
        Tiger redTiger = new Tiger(12, "red", "african tiger", " ramen");

        mammel.sound();
        whiteTiger.sound();
        System.out.println();
        redTiger.displyDetails();
    }
}
