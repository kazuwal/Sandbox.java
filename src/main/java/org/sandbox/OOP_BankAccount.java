package org.sandbox;

public class OOP_BankAccount {

    String accountNumber;
    double balance;

    public OOP_BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        if (amount > 0){
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount >= 0 && this.balance >=amount) {
            balance -= amount;
        }
    }
}
