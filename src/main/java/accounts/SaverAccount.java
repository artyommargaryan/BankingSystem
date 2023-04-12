package accounts;

public class SaverAccount extends Account {
    public SaverAccount(String accountType, double balance, int rate) {
        super(accountType, balance, rate);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        addTransaction("deposit", amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException();
        }

        setBalance(getBalance() - amount);
        addTransaction("withdraw", amount);
    }

    @Override
    public void transfer(Account account, double amount) {
        if (amount > getBalance()) {
            throw new IllegalArgumentException();
        }

        setBalance(getBalance() - amount);
        account.deposit(amount);
        addTransaction("transfer", amount);
    }
}
