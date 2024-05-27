package CodSoftProjects.ATM_Interface;

public class BankAccount {
    private double balance;
    private String userName;

    public BankAccount(String userName, double initialBalance) {
        this.userName = userName;
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public String getUserName() {
        return userName;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}
