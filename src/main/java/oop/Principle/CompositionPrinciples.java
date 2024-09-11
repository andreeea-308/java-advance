package oop.Principle;

/*
    Composition(compozitia) = este procesul de asamblare a unei clase de obiecr prin mai multe clase atribut

 */

class Processor {
    String name;
    int numberOfCores;

    public Processor(String name, int numberOfCores) {
        this.name = name;
        this.numberOfCores = numberOfCores;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", numberOfCores=" + numberOfCores +
                '}';
    }
}

class Ram {
    String name;
    int size;

    public Ram(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}

class PC {
    private Processor processor;
    private Ram ram;

    public PC(Processor processor, Ram ram) {
        this.processor = processor;
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PC{" +
                "processor=" + processor +
                ", ram=" + ram +
                '}';
    }
}
public class CompositionPrinciples {
    public static void main(String[] args) {
        // Metoda 1: initializare prin obiecte intependente
        Processor processor = new Processor("Intel", 8);
        Ram ram = new Ram("CoolRam", 500);
        PC myPC1 = new PC(processor, ram);
        System.out.println(myPC1);

        // Metoda 2: initializare prin apel la constructor
        PC myPC2 = new PC(new Processor("Intel", 16), new Ram("CoolRam", 1000));
        System.out.println(myPC2);
    }
}
