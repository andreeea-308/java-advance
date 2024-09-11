package oop.Principle;
/*

    // ---------- General ---------- //

    Fun fact: Un fisier Java poate contine mai multe clase.

    Clasa = este schita generala a unei tipologii de obiecte; totodata, ea poate fi folosita ca un tip de definitie al obiectelor
    Obiect = este instanta SPECIFICA a unei clase
    Metoda = este functionalitatea unei clase -> functii (returnabile sau void)
    Semnatura metodei = reprezinta modul de definitie al unei functii (ex: public int numaraPufuleti() { bloc de cod de implementare } )
    Constructorul = este mecanismul prin care definim un obiect pe baza atributelor clasei

    // ---------- Keywords ---------- //

    abstract = este o eticheta care se foloseste in momentul in care ne dorim sa definim clase sau metode abstracte
        - Clase abstracte
            -- Initializare
                -> Daca avem mai multe clase intr-un fisier Java, putem defini o clasa secundara abstracta astfel:
                    abstract class <CLASS NAME> {}
                -> Daca avem o singura clasa intr-un fisier Java, si acea clasa este abstracta:
                    public abstract class <CLASS NAME> {}
            -- NU POATE DEFINI OBIECTE
            -- poate sau nu sa contina metode abstracte (optional)
        - Metode abstracte
            -- Initializare: public abstract <METHOD TYPE> <METHOD NAME>();
            -- NU AU IMPLEMENTARE
            -- sunt suprascrise in clasele copil pentru a avea implementari specifice
            -- definesc un comportament comun cu implementare specifica

    modificatori de access: https://nonsookoroafor.medium.com/my-java-story-visibility-modifiers-4368b1919c68
        public = vizibil peste tot
        private = vizibil doar in clasa de definitie
        protected = vizibil in clasa de definitie si in clasele copil
        default = vizibil in clasa si in pachet

    static = se refera la obiecte/metode/blocuri de cod INDEPENDENTE de definitia sau instantierea unui obiect

    super = este un mecanism de accesare a clasei parinte (fie clasa care implementeaza o serie de interfete, fie clasa
    care este mostenita)
        -- se poate accesa prin super orice membru (public sau protected) al clasei parinte: atribute sau metode
        -- se poate accesa prin super constructorul clasei parinte
        -- practic super poate prelua informatii DOAR din clasa parinte si le trimite catre clasele copil

    implements = este un mecanism prin care o clasa se conecteaza la un contract de comportament (INTERFATA) si ii permite sa
        poata implemneta toate metodele stocate

    // ---------- Abstraction Principle ---------- //

    Abstractizarea se refera la conceptul de ascundere a detaliilor de implementare ale clasei si expunerea partilor esentiale
    ale unui obiect. Practic, ne indeamna sa ne focusam pe ideea de obiect si cum il putem folosi pentru a interactiona
    cu functionalitatile clasei.

    Exemple: clasele abstracte si interfetele

    Clasa de configuratie = este o clasa care ne permite sa setam anumite atribute sau comportamente generale si sa le putem folosi
    in definirea altor contexte specifice -> clasa abstracta

        Clasa abstracta este o clasa care nu poate fi instantiata si care POATE (sau nu) sa contina metode abstracte. Scopul principal
        fiind definirea unor caracteristici (atribute) sau comportamente comune pentru a putea fi mostenita de alte clase copil.
            - NU DEFINESTE O INSTANTA -> inseamna ca o clasa abstracta nu poate fi folosita de tip de definitie (tip de date)
            - atributul = o caracteristica a clasei
            - comportamentul comun se poate realiza in doua moduri:
                -- prin metode cu implementare -> orice fel de functii care au un bloc de cod si fac ceva
                -- prin metode fara implementare -> orice fel de functii definite STRICT PRIN SEMNATURA LOR

    Clasa de contract = este o clasa care defineste contractul comportamental al unei tipologii de clase -> interfata

        Interfata este o referinta a unui tip de date si are scopul de a stabili o lista de functionalitati pe care o clasa le poate
    implementa.
        -- cel mai adesea o interfata stocheaza DOAR metode fara implementare (doar semnatura)
        -- mereu toate metodele sunt publice si abstracte
        -- foarte rar mai puteti defini metode default sau statice
        -- poate defini obiecte odata ce a fost implementata de alte clase

 */

//Clasa configuratie -> PARINTE
abstract class Shape {
    //Atribute generale care sa se potriveasca tuturor urmatoarelor clase copil
    public double perimeter;
    public double area;

    //Metoda fara implementare = metoda abstracta = functia definita prin semnatura metodei
    abstract double calculateArea();

    //Metoda cu implementare =  e o functie cu bloc de cod
    public void display() {
        System.out.println(perimeter + " " + area);
    }

}

//Clasa de contract
interface Animal {
    void makeSound();

    default void move() {
        System.out.println("This animal moves");
    }

    static void breathe() {
        System.out.println("All animals breathe");
    }
}

class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        Animal.super.move();
        System.out.println("Dog moves");
    }
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void move() {
        Animal.super.move();
        System.out.println("Cat moves");
    }
}

public class AbstractionPrinciples {
    public static void main(String[] args) {
        Animal.breathe();
        System.out.println();

        //Intodeauna cand aveti o interfata principala care defineste contractul de comportament al unei tipologii de clase,
        //Instantierea obiectului se face pe baza ei

        //Definitia unui obiect porneste de la GENERAL la SPECIFIC
        Animal samoyed = new Dog();
        Animal britishShortHair = new Cat();
        Dog labrador = new Dog();

        samoyed.makeSound();
        labrador.move();
        britishShortHair.makeSound();
        britishShortHair.move();
    }
}
