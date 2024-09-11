package OOP.Exercise2;

public class BateryTank implements Tank {
    protected double power;

    public BateryTank(double power) {
        this.power = power;
    }

    @Override
    public double addCapacity(double powerAdded) {
        return this.power = power + powerAdded;
    }

    @Override
    public void printCapacity() {
        System.out.println("Current power is:" + power);
    }

    @Override
    public double getCapacity() {
        return this.power;
    }
}
