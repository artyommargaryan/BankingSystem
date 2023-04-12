package banks;

import accounts.Account;
import custmer.Customer;

public class HSBCBank extends BankingSystem {

    @Override
    public void deposit(Customer customer, Account account, double amount) {
        validateCustomer(customer);
        customer.deposit(account, amount);
    }

    @Override
    public void withdraw(Customer customer, Account account, double amount) {
        validateCustomer(customer);
        customer.deposit(account, amount);
    }

    @Override
    public void transfer(Customer customer, Account senderAccount, Account destinationAccount, double amount) {
        validateCustomer(customer);
        customer.transfer(senderAccount, destinationAccount, amount);
    }

    @Override
    public void transfer(Customer senderCustomer, Account senderAccount, Customer destinationCustomer, Account destinationAccount, double amount) {
        validateCustomer(senderCustomer);
        validateCustomer(destinationCustomer);
        senderCustomer.transfer(senderAccount, destinationCustomer, destinationAccount, amount);
    }
}
