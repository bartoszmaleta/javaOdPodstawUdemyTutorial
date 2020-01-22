package oop.exceptions;

public class Bottle {
    private double litres;

    Bottle(double litres) {
        this.litres = litres;
    }

    double getLitres() {
        return litres;
    }

    void add(double amount) {
        this.litres += amount;
    }

    boolean remove(double amount) {
        if (amount < litres) {
            this.litres -= amount;
        } else {
            return false;
        }
        return true;
    }

    void transfer(double amount, Bottle whichBottle) {
        if (this.remove(amount)) {
            whichBottle.add(amount);
        } else {
            System.out.println("Not enough litres");
        }
    }

    public static void main(String[] args) {

        try {
            System.out.println(5/0);
        } catch (ArithmeticException ex) {
            System.out.println("");
        }


        System.out.println("whatever");
        
    }
}