package OOP.Exercise2;

public class DieselCar extends Car{
    public DieselCar(FuelTank fuelTank) {
        super(fuelTank);
    }
    protected String getDiscription(){
        return "Car type is a diesel";
    }

    @Override
    public void showRemaningDistance() {
        System.out.println("Remaning distance is: " + (tank.getCapacity() * 20));
    }
}
