package oop.Exercitii.Vehicle;

public class Truck extends Vehicle{
    public int numberOfDoors;
    public int numberOfWheels;
    public Truck(String make, String model, int numberOfDoors, int numberOfWheels) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
        this.numberOfWheels = numberOfWheels;
    }
    void start(){
        System.out.println("tit tit");
    }

}
