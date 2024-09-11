package oop.Exercitii.Shape;
/*
Exercise 1: Abstraction
Create a set of geometric shapes in Java where each shape has its own method to calculate area and perimeter.
Implement abstraction by defining an abstract class Shape with abstract methods for calculating area and perimeter.
Create concrete classes Circle, Rectangle, and Triangle that extend the Shape class and implement their specific methods
for area and perimeter calculation.
 */
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0);
        Rectangle rectangle = new Rectangle(4.0, 2.0);
        Triangle triangle = new Triangle(2.0, 4.0, 3.0);
        System.out.println(circle.perimeter());
        System.out.println(circle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
    }
}
