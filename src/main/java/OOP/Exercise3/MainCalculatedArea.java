package OOP.Exercise3;

public class MainCalculatedArea {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.getArea(getShape(3)));

    }

    public static Shape getShape(int argument) {
        Circle circle = new Circle(2);
        Square square = new Square(5.0);
        Rectangle rectangle = new Rectangle(9, 2);
        if (argument == 1) {
            return circle;
        } else if (argument == 2) {
            return square;
        } else {
            return rectangle;
        }
    }
}
