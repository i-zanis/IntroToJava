import java.util.Date;

public class E11_03 {
    public static void main(String[] args) {
Account a = new Account();
        System.out.println(a.getBalance());
        a.withdraw(1000000000); //test number for overdraft
        System.out.println(a.getBalance());
    }
}
class Account {
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
class Savings extends  Account {
    @Override
    public void withdraw(double amount) {
        if (amount > getBalance()) {
            System.out.println("The account cannot be overdrawn.\nPlease enter a different amount");
        }
        super.withdraw(amount);
    }

    class Current extends Account {
        @Override
        public void withdraw(double amount) {
            if (amount > getBalance() + 1000) {
                System.out.println("You have passed the overdraft limit\n Please enter a different amount");
            }
            super.withdraw(amount);
        }

        @Override
        public String toString() {
            return "SavingsAccount{" +
                    "mBalance=" + getBalance() +
                    '}';
        }
    }
}

