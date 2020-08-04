import java.util.Date;

public class E09_07 {
    public static void main(String[] args) {
    Account test = new Account(1112, 20000, 4.5);
    test.withdraw(5000);
    test.deposit(1);
        System.out.println("The balance is " + test.getBalance() + " for this date " + test.dateCreated);
        System.out.println("The monthly interest is " + test.getMonthlyInterestRate());
    }


    static class Account {
        private int id = 0;
        private double balance = 0;
        private double annualInterestRate = 0;
        private final Date dateCreated = new Date();

        Account() {

        }

        Account(int id, int balance, double annualInterestRate) {
            this.id = id;
            this.balance = balance;
            this.annualInterestRate = annualInterestRate/100;
        }

        public int getId() {
            return this.id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public double getBalance() {
            return this.balance;
        }
        public void setBalance(double balance) {
            this.balance = balance;
        }

        public Date getDate() {
            return dateCreated;
        }

        public double getMonthlyInterestRate() {
            return (this.annualInterestRate * this.balance) /12;
        }
        public void withdraw(double amount) {
            this.balance = this.balance - amount;
        }
        public void deposit(double amount) {
            this.balance = this.balance + amount;
        }

    }
}
