package custmer;

import accounts.Account;
import accounts.SaverAccount;

import java.util.LinkedList;
import java.util.List;

public class Customer{
    private String name;
    private String address;
    private String phoneNumber;
    private List<Account> accountList;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.accountList = new LinkedList<>();
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(String accountType, int rate) {
        if (accountType.equals("saver")) {
            accountList.add(new SaverAccount(accountType, 0, rate));
        } else {
            throw new IllegalArgumentException(accountType + "not exist");
        }
    }

    public void addAccount(Account account) {
        accountList.add(account);
    }

    public void deposit(Account account, double amount) {
        if (!accountList.contains(account)) {
            throw new IllegalArgumentException("account");
        }
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        if (!accountList.contains(account)) {
            throw new IllegalArgumentException("account");
        }
        account.withdraw(amount);
    }

    public void transfer(Account senderAccount, Account destAccount, double amount) {
        if (!accountList.contains(senderAccount)) {
            throw new IllegalArgumentException("account");
        }

        senderAccount.transfer(destAccount, amount);
    }

    public void transfer(Account senderAccount, Customer destCustomer, Account destAccount, double amount) {
        if (!accountList.contains(senderAccount)) {
            throw new IllegalArgumentException("account");
        }

        destCustomer.deposit(destAccount, amount);
    }
}
