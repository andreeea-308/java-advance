package OOP.Exercise2;

public abstract class Car {
    protected String color;
    protected int doorNumbers;
    protected Tank tank;

    public Car(String color, int doorNumbers, Tank tank) {
        this.color = color;
        this.doorNumbers = doorNumbers;
        this.tank =tank;
    }

    public Car(Tank tank) {
        this.tank = tank;
    }

    public Car() {
    }

    protected String getDiscription(){
        return "Car type is a polymorphic type";
    }

    public abstract void showRemaningDistance();
}
