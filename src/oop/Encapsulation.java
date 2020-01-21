package oop;

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount savingAccount = new BankAccount();

        System.out.println(savingAccount.getBalance());
        savingAccount.deposit(7000);

        savingAccount.withdraw(400);
        System.out.println(savingAccount.getBalance());

        if (savingAccount.withdraw(4)) {
            System.out.println("wihtdrawed");
        } else {
            System.out.println("not enough money");
        }

        savingAccount.deposit(4000);
        System.out.println(savingAccount.getBalance());

    }
}

class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 1000;
    }

    int getBalance() {
        return balance;
    }

    private void setBalance(int balance) {
        this.balance = balance;
    }

    boolean withdraw(int amount) {
        if (balance < amount) {
            return false;
        } else {
            // balance -= amount; 
            setBalance(balance - amount);
        }
        return true; 
    }

    boolean deposit(int amount) {
        setBalance(balance + amount);
        return true;
    }
}