package OOP.Exercise3;

public class MainMethod {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(5.0);
        shapes[2] = new Rectangle(2.0, 3.0);


        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Initial area: " + shapes[i].getArea());
            Shape resizedShape = shapes[i].resizeShape(3);
            System.out.println("Resized area: " + resizedShape.getArea());
        }
    }
}
