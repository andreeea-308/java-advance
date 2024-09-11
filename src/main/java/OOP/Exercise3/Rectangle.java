package OOP.Exercise3;

public class Rectangle extends Shape {
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }


    @Override
    public double getArea() {
        return lenght * width;
    }


    @Override
    public Shape resizeShape(int factor) {
        return new Rectangle(this.lenght*factor, this.width*factor);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lenght=" + lenght +
                ", width=" + width +
                '}';
    }
}
