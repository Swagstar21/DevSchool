public class Account {
    int number;
    String pin;
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public String getPin() {
        return pin;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public Account() {
    }

    public Account(int number, String pin, double balance) {
        this.number = number;
        this.pin = pin;
        this.balance = balance;
    }

    public double deposit(double sum) {
        balance += sum;
        return balance;
    }

    public boolean withdrawal(double sum) {
        if (balance >= sum) {
            balance -= sum;
            return true;
        }
        return false;
    }
}
