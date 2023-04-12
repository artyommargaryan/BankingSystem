package banks;

import accounts.Account;
import custmer.Customer;

import java.util.ArrayList;
import java.util.List;

public abstract class BankingSystem {
    private final List<Customer> customers;

    BankingSystem() {
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    private boolean isValidCustomer(Customer customer) {
        return !getCustomers().contains(customer);
    }

    protected void validateCustomer(Customer customer) {
        if (!getCustomers().contains(customer)) {
            throw new IllegalArgumentException("No such Customer");
        }
    }

    public abstract void deposit(Customer customer, Account account, double amount);

    public abstract void withdraw(Customer customer, Account account, double amount);

    public abstract void transfer(Customer customer, Account senderAccount, Account destinationAccount, double amount);

    public abstract void transfer(Customer senderCustomer, Account senderAccount, Customer destinationCustomer, Account destinationAccount, double amount);
}
