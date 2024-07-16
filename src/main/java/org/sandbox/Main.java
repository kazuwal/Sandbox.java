package org.sandbox;


public class Main {
    public static void main(String[] args) {

        var oopAccount = new OOP_BankAccount("1234567890", 100.0);

        oopAccount.deposit(500.0);
        oopAccount.withdraw(200.0);

        System.out.println("OOP_BankAccount - [number]: " + oopAccount.getAccountNumber());
        System.out.println("OOP BankAccount - [balance]: " + oopAccount.getBalance());

        var dodAccount = new DOD_BankAccount(1);

        dodAccount.setAccount(0, "1234567890", 100.0);

        dodAccount.deposit(0, 500.0);
        dodAccount.withdraw(0, 200.0);

        System.out.println("DOD_BankAccount - [number]: " + dodAccount.getAccountNumber(0));
        System.out.println("DOD BankAccount - [balance]: " + dodAccount.getBalance(0));

    }
}