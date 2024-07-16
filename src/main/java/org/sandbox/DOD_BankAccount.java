package org.sandbox;

class AccountNumberData {
    public String[] accountNumbers;
}

class BalanceData {
    public double[] balances;
}

public class DOD_BankAccount {
    private AccountNumberData accountNumberData;
    private BalanceData balanceData;

    public DOD_BankAccount(int numOfAccounts) {
        accountNumberData = new AccountNumberData();
        balanceData = new BalanceData();

        accountNumberData.accountNumbers = new String[numOfAccounts];
        balanceData.balances = new double[numOfAccounts];
    }

    public void setAccount(int index, String accountNumber, double balance) {
        accountNumberData.accountNumbers[index] = accountNumber;
        balanceData.balances[index] = balance;
    }

    public String getAccountNumber(int index) {
        return accountNumberData.accountNumbers[index];
    }

    public double getBalance(int index) {
        return balanceData.balances[index];
    }

    public void deposit(int index, double amount) {
        if (amount > 0) {
            balanceData.balances[index] += amount;
        }
    }

    public void withdraw(int index, double amount) {
        if (amount >= 0 && balanceData.balances[index] >= amount) {
            balanceData.balances[index] -= amount;
        }
    }
}
