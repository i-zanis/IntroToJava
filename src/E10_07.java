import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class E10_07 {
public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account[] accounts = new Account[10];

        for (int i = 0; i < accounts.length; i++) {
        accounts[i] = new Account(i, 100);
        }

        int option = 0;
        int id = askForID(accounts);
        while (option != 4) {
        Account user = getAccount(accounts, id);
        System.out.print(
        "Main menu\n" +
        "1: check balance\n" +
        "2: withdraw\n" +
        "3: deposit\n" +
        "4: exit\n" +
        "Enter a choice: ");
        option = input.nextInt();
        switch (option) {
        case 1:
        System.out.println("The balance is $" + user.getBalance() + ".\n");
        break;
        case 2:
        System.out.print("Enter an amount to withdraw: ");
        user.withdraw(input.nextDouble());
        break;
        case 3:
        System.out.print("Enter an amount to deposit: ");
        user.deposit(input.nextDouble());
        break;
        case 4:
        System.out.println("Logged out...");
        System.out.println("");
        id = askForID(accounts);
        option = 0;
        break;
        default:
        System.out.println("Invalid input.. Enter a number 1-4");
        }

        }

        }

public static int askForID(Account[] accounts) {

        Scanner input = new Scanner(System.in);

        int id = 0;
        boolean isValidID = false;

        while (!isValidID) {
        System.out.print("Enter an ID: ");
        id = input.nextInt();

        if (!hasID(accounts, id)) {
        System.out.println("INVALID ID: Try again.");

        } else {
        isValidID = true;
        }
        }

        return id;
        }

public static Account getAccount(Account[] accounts, int id) {

        for (Account account : accounts) {
        if (id == account.getId()) {
        return account;
        }
        }
        return null;
        }
public static boolean hasID(Account[] accounts, int id) {

        for (Account account : accounts) {
        if (id == account.getId()) {
        return true;
        }
        }

        return false;
        }


        }


class Account {

    protected String mName;
    protected int mId;
    protected double mBalance;
    protected double mAnnualInterestRate; // AnnualInterestRate is percentage.
    protected Date mDateCreated;
    protected ArrayList<> mTransactions;


    public Account() {
        mDateCreated = new Date();
        mTransactions = new ArrayList<>();
    }

    public Account(int id, double balance) {
        this();
        mId = id;
        mBalance = balance;
    }

    public Account(String name, int id, double balance) {
        this(id, balance);
        mName = name;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public double getAnnualInterestRate() {
        return mAnnualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        mAnnualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return mDateCreated;
    }

    public double getMonthlyInterestRate() {
        return mBalance * (mAnnualInterestRate / 12) / 100;
    }

    public void withdraw(double amount) {
        mTransactions.add(new Transaction('W', amount, mBalance, "withdraw"));
        mBalance -= amount;
    }

    public void deposit(double amount) {
        mTransactions.add(new Transaction('D', amount, mBalance, "deposit"));
        mBalance += amount;
    }

    @Override
    public String toString() {
        return "Account name: " + mName + "\n" + "Interest rate: " + mAnnualInterestRate + "\n" + mTransactions;
    }

    public ArrayList<Transaction> getTransactions() {
        return new ArrayList<>(mTransactions);
    }

}