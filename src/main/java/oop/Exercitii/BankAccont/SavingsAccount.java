package oop.Exercitii.BankAccont;

public class SavingsAccount extends Account {
    private double dobanda;

    public SavingsAccount(String accountNumber, Double balance, double dobanda) {
        super(accountNumber, balance);
        this.dobanda = dobanda;
    }

    public double getDobanda() {
        return dobanda;
    }

    public void setDobanda(double dobanda) {
        this.dobanda = dobanda;
    }

    void display(){
        System.out.println(this.getAccountNumber() + " " + this.getBalance() +" "+ this.dobanda);
    }

    void addDobanda(){
        double procent = getBalance() * dobanda / 100;
        setBalance(getBalance() + procent);
        System.out.println("Balance increas with " + procent + " rate");
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "dobanda=" + dobanda +
                '}';
    }
}
