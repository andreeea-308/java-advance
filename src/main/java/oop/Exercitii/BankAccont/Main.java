package oop.Exercitii.BankAccont;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("YUFE8457-AFUA9486", 50.0);
        account.addMoneyToTheAccount(800.0);
        SavingsAccount savingsAccount = new SavingsAccount("YUFE4636-DHDD1674", 1569.0, 3.2);
        savingsAccount.addDobanda();
        System.out.println("The balance wit rate is: " + savingsAccount.getBalance());
    }
}
