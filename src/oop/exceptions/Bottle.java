package oop.exceptions;

import java.util.logging.Logger;

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

    void remove(double amount) throws NotEnoughLittres{
        if (amount < litres) {
            this.litres -= amount;
        } else {
            throw new NotEnoughLittres("Not enough litres");
        }
    }

    void transfer(double amount, Bottle whichBottle) throws NotEnoughLittres{
        this.remove(amount);
        whichBottle.add(amount);
    }

    public static void main(String[] args) {

        try {
            System.out.println(5 / 0);
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
                System.out.println(5 / 0);
                throw new MyException("a is equal to 10!");
            }
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        Bottle bottle1 = new Bottle(5);
        Bottle bottle2 = new Bottle(10);

        try {
            bottle1.transfer(20, bottle2);
        } catch (NotEnoughLittres ex) {
            System.out.println(ex.getMessage());
        }

    }
}

class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

class NotEnoughLittres extends Exception {
    public NotEnoughLittres(String string) {
        super(string);
    }
} 