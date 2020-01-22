package oop.nestedClasses;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        
        
    }
}

class Account {
    private double balance;

    double getBalance() {
        return this.balance;
    }

    class Interest {
        private double interestRate;
         
    }
}