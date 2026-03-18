package repository;

import model.Account;
import java.util.*;

public class AccountRepository {

    private Map<Integer, Account> accounts = new HashMap<>();

    public void addAccount(Account acc) {
        accounts.put(acc.getId(), acc);
    }

    public Account getAccount(int id) {
        return accounts.get(id);
    }

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }
    public void deleteAccount(int id) {
    accounts.remove(id);
}
}