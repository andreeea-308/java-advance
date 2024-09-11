package oop.Exercitii.Vehicle;

public class Car extends Vehicle{
    public int numberOfDoors;
    public int numberOfWheels;
    public Car(String make, String model, int numberOfDoors, int numberOfWheels) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }
    void start(){
        System.out.println("beep beep");
    }

}
