package oop.Exercitii.Shape;

public class Rectangle extends Shape{
    private double lungime;
    private double latime;

    public Rectangle(double lungime, double latime) {
        this.lungime = lungime;
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    @Override
    public double perimeter(){
        return 2*(latime+lungime);
    };

    @Override
    public double area(){
        return lungime*latime;
    };
}
