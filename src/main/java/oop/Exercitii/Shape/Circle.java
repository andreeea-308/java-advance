package oop.Exercitii.Shape;

public class Circle extends Shape{
    private double raza;

    public Circle(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public double perimeter(){
        return 2*Math.PI*raza;
    };

    @Override
    public double area(){
        return Math.PI*Math.pow(raza, 2.0);
    };
}
