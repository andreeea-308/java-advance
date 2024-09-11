package oop.Principle;

/*
    Incapsularea este conceptul de a ascunde atributele prim modificatorul de acces private si de a oferi acces asupra lor
    prin getters/setters

    Getter = e o metoda cu return type asemenea atributului care intoarced valoarea
    Setter = e o metoda void care produce un efect si anume acela de a seta o valoare noua prin asignare

 */

// Clasa Obiect = o clasa de tipul POJO(plain old java object) care defineste trasaturile si comportamentul unei tipologii de obiecte
class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private int age;

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//necesar in cazul in care atributele sunt private
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}

public class EncapsulationPrinciples {
    public static void main(String[] args) {
        Employee worker = new Employee(1, "Iancu", "Jianu", 25);
        System.out.println(worker);
        int myAge =  worker.getAge();
        worker.setAge(15);
        System.out.println(myAge + "->" + worker);
    }
}
