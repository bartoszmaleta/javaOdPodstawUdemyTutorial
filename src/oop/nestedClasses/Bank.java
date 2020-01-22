package oop.nestedClasses;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(1000);
        
        account.start(4);
    }
}

class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return this.balance;
    }

    void start(double rate) {
        Interest interest = new Interest(rate);
        // interest.changeBalance(rate);
    }

    class Interest {
        private double interestRate;
        
        public Interest(double interestRate) {
            this.interestRate = interestRate;
            this.changeBalance(interestRate);
        }
        void changeBalance(double rate) {
            double interestTemp = (balance * rate) / 100;
            balance += interestTemp;
        }
    }
}