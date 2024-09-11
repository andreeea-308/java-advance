package oop.Exercitii.Vehicle;
/*
Exercise 4: Inheritance
Model a vehicle rental system where there are different types of vehicles such as cars, trucks, and motorcycles.
Implement inheritance by creating a base class Vehicle with common attributes like make, model, and methods like start().
Derive subclasses like Car, Truck, and Motorcycle from the Vehicle class, each with their own specific behaviors.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Dacia", "mic", 4, 4);
        Truck truck = new Truck("Zeu", "4345", 2, 18);
        Motorcyle motorcyle = new Motorcyle("Audi", "big", 0, 2);
        System.out.println(car);
        System.out.println(truck);
        System.out.println(motorcyle);
        car.start();
        truck.start();
        motorcyle.start();
    }
}
