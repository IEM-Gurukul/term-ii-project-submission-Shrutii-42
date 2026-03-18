package service;

import model.Account;
import repository.AccountRepository;
import java.util.List;

public class AccountService {

    private AccountRepository repo = new AccountRepository();

    public void createAccount(Account acc) {
        repo.addAccount(acc);
    }

    public Account getAccount(int id) {
        return repo.getAccount(id);
    }

    public List<Account> getAllAccounts() {
        return repo.getAllAccounts();
    }

    public void deposit(int id, double amount) {
        Account acc = repo.getAccount(id);
        if (acc != null) {
            acc.deposit(amount);
        }
    }

    public void withdraw(int id, double amount) {
        Account acc = repo.getAccount(id);
        if (acc != null) {
            acc.withdraw(amount);
        }
    }
}