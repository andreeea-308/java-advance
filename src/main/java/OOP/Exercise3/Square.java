package OOP.Exercise3;

public class Square extends Shape {
    private double lenght;

    public Square(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return lenght * lenght;
    }

    @Override
    public Shape resizeShape(int factor) {
        return new Square(this.lenght*factor);
    }

    @Override
    public String toString() {
        return "Square{" +
                "lenght=" + lenght +
                '}';
    }
}
