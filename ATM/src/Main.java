import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));


        BankDatabase db = new BankDatabase();
        db.addAccount(new Account(1, "0000", 100.0));
        db.addAccount(new Account(2, "9999", 21.3));
        db.addAccount(new Account(3, "1234", 214543.0));

        ATM atm = new ATM();
        atm.setCurrentAccount(null);
        atm.setD10(50);
        atm.setD100(10);
        atm.setDb(db);

        String input = new String();
        while (!input.equals("exit")) {
            try {
                input = reader.readLine();
            }
            catch (Exception e) {

            }
            if (input.equals("login")) {
                System.out.println("Insert number");
                String s = new String();
                try {
                   s = reader.readLine();
                }
                catch (Exception e) {

                }
                int id = Integer.parseInt(s);
                System.out.println("Insert PIN");
                String pin = new String();
                try {
                    pin = reader.readLine();
                }
                catch (Exception e) {

                }
                atm.logIn(id, pin);

            }
            else if (input.equals("balance")) {
                atm.balanceInquiry();
            }
            else if (input.equals("deposit")) {
                System.out.println("Insert sum to deposit");
                String s = new String();
                try {
                    s = reader.readLine();
                }
                catch (Exception e) {

                }
                double sum = Integer.parseInt(s);
                atm.deposit(sum);
            }
            else if (input.equals("withdraw")) {
                System.out.println("Insert sum to withdraw");
                String s = new String();
                try {
                    s = reader.readLine();
                }
                catch (Exception e) {

                }
                double sum = Integer.parseInt(s);
                atm.withdrawal(sum);
            }
            else if (input.equals("logout")) {
                if (atm.logOut())
                    System.out.println("Logged out");
                else System.out.println("Not logged in");
            }
            else if (input.equals("exit")) {
                System.out.println("Exiting...");
                break;
            }
            else System.out.println("Invalid operation");
        }
    }
}
