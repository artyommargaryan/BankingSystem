package transactions;

import accounts.Account;

public class Transaction {
    private Account account;
    private String type;
    private double amount;

    public Transaction(Account account, String type, double amount) {
        this.account = account;
        this.type = type;
        this.amount = amount;
    }
}
