package oop.Exercitii.BankAccont;
/*
Solve me this one Bank Account System:
Implement a system to manage bank accounts including classes for Account, SavingsAccount,
and CheckingAccount. Use encapsulation to protect sensitive data such as balance.
 */
public class Account {
    private String accountNumber;
    private Double balance;

    public Account(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void addMoneyToTheAccount (Double addNewMoney) {
        balance = balance + addNewMoney;
        System.out.println("New ballance is: " + balance);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ballane=" + balance +
                '}';
    }
}

