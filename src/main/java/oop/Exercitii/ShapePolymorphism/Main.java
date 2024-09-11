package oop.Exercitii.ShapePolymorphism;
/*
Exercise 5: Polymorphism
Create a shape recognition application where users can identify various shapes based on their properties.
Implement polymorphism by defining an interface Shape with a method identify(). Implement this interface in classes
representing different shapes like Circle, Rectangle, and Triangle. When the user interacts with the application,
the appropriate identify() method is invoked based on the shape recognized.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();
        circle.identify();
        rectangle.identify();
        triangle.identify();
    }
}
