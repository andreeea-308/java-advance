package oop.Exercitii.Medical;


class MedicationType {
    private String type;

    public MedicationType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "MedicationType{" +
                "type='" + type + '\'' +
                '}';
    }
}
public class Medication {
    private String name;
    private MedicationType medicationType;
    private double price;

    public Medication(String name, MedicationType medicationType, double price) {
        this.name = name;
        this.medicationType = medicationType;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MedicationType getMedicationType() {
        return medicationType;
    }

    public void setMedicationType(MedicationType medicationType) {
        this.medicationType = medicationType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", medicationType=" + medicationType +
                ", price=" + price +
                '}';
    }
}
