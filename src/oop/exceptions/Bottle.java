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
            // super class Exception, all exception inherits from Exception
        // } catch (Exception ex) {
        } catch (ArithmeticException ex) {
            System.out.println("Error occured = " + ex.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
        System.out.println("whatever");


        int a = 10;
        try {
            if (a == 10) {
                throw new MyException("a is equal to 10!");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}