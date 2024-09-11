package OOP.Exercise2;

public class ElectricCar extends Car {
    public ElectricCar(BateryTank bateryTank) {
        super(bateryTank);
    }

    protected String getDiscription() {
        return "Car type is a electric";
    }

    @Override
    public void showRemaningDistance() {
        System.out.println("Remaning distance is: " + (tank.getCapacity() * 10));
    }
}
