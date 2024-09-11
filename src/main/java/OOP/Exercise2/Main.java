package OOP.Exercise2;

public class Main {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(new BateryTank(200.0));
        DieselCar dieselCar = new DieselCar(new FuelTank(50.0));
        System.out.println(electricCar.getDiscription());
        System.out.println(dieselCar.getDiscription());
        electricCar.tank.addCapacity(2.20);
        dieselCar.tank.addCapacity(15.2);
        electricCar.tank.printCapacity();
        dieselCar.tank.printCapacity();
        electricCar.showRemaningDistance();
        dieselCar.showRemaningDistance();
    }
}
