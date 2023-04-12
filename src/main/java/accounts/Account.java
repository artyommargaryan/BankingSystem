package accounts;

import transactions.Transaction;

import java.util.LinkedList;
import java.util.List;

public abstract class Account {
    private String accountType;
    private double balance;
    private int rate;
    private final List<Transaction> transactionList;

    public Account(String accountType, double balance, int rate) {
        this.accountType = accountType;
        this.balance = balance;
        this.rate = rate;
        transactionList = new LinkedList<>();
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public int getRate() {
        return rate;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    protected void addTransaction(String type, double amount) {
        transactionList.add(new Transaction(this, type, amount));
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void transfer(Account account, double amount);
}
