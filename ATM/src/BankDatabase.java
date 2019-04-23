import java.util.ArrayList;
import java.util.List;

public class BankDatabase {
    List<Account> accounts;

    public BankDatabase(List<Account> accounts) {
        this.accounts = accounts;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public BankDatabase() {
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account ac) {
        accounts.add(ac);
    }
}
