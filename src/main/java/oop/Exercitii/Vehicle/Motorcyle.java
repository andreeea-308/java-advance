package oop.Exercitii.Vehicle;

public class Motorcyle extends Vehicle{
    public int numberOfDoors;
    public int numberOfWheels;
    public Motorcyle(String make, String model, int numberOfDoors, int numberOfWheels) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }
    void start(){
        System.out.println("vrumm!");
    }

}
