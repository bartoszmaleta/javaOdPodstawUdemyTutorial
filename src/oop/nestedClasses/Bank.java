package oop.nestedClasses;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(1000);
        
        System.out.println(account.getBalance());

        account.createAccount(4);
        System.out.println(account.getBalance());
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

    void createAccount(double rate) {
        // "double rate" is not available for "class Inters"
        
        // but if you use "final"
        // void createAccount(final double rate) {
        // then you does not need parameters below!!!!
            
        Interest interest = new Interest(rate);
        // interest.changeBalance(rate);

        // CAN ALSO CREATE CLASS INSIDE METHOD! IT WILL WORK
        // class Interest {
            // private double interestRate;
            // 
            // public Interest(double interestRate) {
                // this.interestRate = interestRate;
                // this.changeBalance(interestRate);
            // }
            // void changeBalance(double rate) {
                // double interestTemp = (balance * rate) / 100;
                // balance += interestTemp;
            // }
        // }
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