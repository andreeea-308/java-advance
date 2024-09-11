package OOP.Exercise2;

public class FuelTank implements Tank{
    protected double fuel;

    public FuelTank(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public double addCapacity(double fuelCapacity) {
        return this.fuel = fuel + fuelCapacity;
    }

    @Override
    public void printCapacity() {
        System.out.println("Current fuel is:"+fuel);
    }

    @Override
    public double getCapacity() {
        return this.fuel;
    }
}
