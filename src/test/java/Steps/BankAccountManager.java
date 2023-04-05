package Steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BankAccountManager {

    public ArrayList accounts;

    public BankAccountManager() {
        accounts = new ArrayList();
    }

    public void create() {
        accounts.add(0.0);
    }

    public void deposit(int accountId, double amount) {
        double amnt = (double) accounts.get(accountId);
        accounts.add(accountId, amnt + amount);
    }

    public void withdraw(int accountId, double amount) {
        double amnt = (double) accounts.get(accountId);
        accounts.add(accountId, amnt - amount);
    }

    public double getBalance(int accountId) {
        return (double) accounts.get(accountId);
    }
}