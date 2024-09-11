package OOP.Exercise3;

public class MainResize {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(5.0);
        Rectangle rectangle = new Rectangle(9, 2);
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        System.out.println(circle.resizeShape(2));
        System.out.println(square.resizeShape(2));
        System.out.println(rectangle.resizeShape(2));
    }
}
