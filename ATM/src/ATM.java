import java.util.List;

public class ATM {

    Account currentAccount;
    BankDatabase db;
    int d10, d100;

    public int getD10() {
        return d10;
    }

    public BankDatabase getDb() {
        return db;
    }

    public void setDb(BankDatabase db) {
        this.db = db;
    }

    public void setD10(int d10) {
        this.d10 = d10;
    }

    public int getD100() {
        return d100;
    }

    public void setD100(int d100) {
        this.d100 = d100;
    }

    public ATM() {
    }

    public Account getCurrentAccount() {
        return currentAccount;
    }

    public void setCurrentAccount(Account currentAccount) {
        this.currentAccount = currentAccount;
    }

    public ATM(List<Account> accounts, Account currentAccount) {
        this.db.accounts = accounts;
        this.currentAccount = currentAccount;
    }

    public void logIn(int number, String pin) {
        for (int i = 0; i < db.accounts.size(); i++) {
            if (db.accounts.get(i).getNumber() == number &&
                    db.accounts.get(i).getPin().equals(pin)) {
                currentAccount = db.accounts.get(i);
                System.out.println("Logged in. ID: " + number);
                return;
            }
        }
        System.out.println("Try again");
    }

    public boolean logOut() {
        if (currentAccount == null)
            return false;
        else {
            currentAccount = null;
            return true;
        }
    }

    public void balanceInquiry() {
        if (currentAccount == null)
            System.out.println("Not logged in");
        else {
            double balance = currentAccount.getBalance();
            System.out.println("The balance is " + Double.toString(balance));
        }
    }

    public void withdrawal(double sum) {
        if (currentAccount == null)
            System.out.println("Not logged in");
        else {
            if (sum == 20.0 && d10 >= 2) {
                boolean result = currentAccount.withdrawal(sum);
                if (result)
                    d10 -= 2;
                double balance = currentAccount.getBalance();
                System.out.println("The balance is " + Double.toString(balance));
            }
            else if (sum == 40.0 && d10 >= 4) {
                boolean result = currentAccount.withdrawal(sum);
                if (result)
                    d10 -= 4;
                double balance = currentAccount.getBalance();
                System.out.println("The balance is " + Double.toString(balance));
            }
            else if (sum == 60.0 && d10 >= 6) {
                boolean result = currentAccount.withdrawal(sum);
                if (result)
                    d10 -= 6;
                double balance = currentAccount.getBalance();
                System.out.println("The balance is " + Double.toString(balance));
            }
            else if (sum == 100.0 && d100 >= 1) {
                boolean result = currentAccount.withdrawal(sum);
                if (result)
                    d100 -= 1;
                double balance = currentAccount.getBalance();
                System.out.println("The balance is " + Double.toString(balance));
            }
            else if (sum == 200.0 && d100 >= 2) {
                boolean result = currentAccount.withdrawal(sum);
                if (result)
                    d100 -= 2;
                double balance = currentAccount.getBalance();
                System.out.println("The balance is " + Double.toString(balance));
            }
        }
    }

    public void deposit(double sum) {
        if (currentAccount == null)
            System.out.println("Not logged in");
        else {
            double result = currentAccount.deposit(sum);
            System.out.println("Suma din cont este acum " + Double.toString(result));
        }
    }



}
