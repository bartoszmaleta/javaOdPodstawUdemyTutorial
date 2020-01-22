package oop;

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
        Bottle[] bottle = new Bottle[3];

        for (int i = 0; i < bottle.length; i++) {
            bottle[i] = new Bottle(i + 3);
        }

        System.out.println(bottle[0].getLitres());
        System.out.println(bottle[1].getLitres());
        System.out.println(bottle[2].getLitres());
        // System.out.println(bottle[3].getLitres());

        bottle[0].remove(1);
        System.out.println(bottle[0].getLitres());

        System.out.println("------");
        System.out.println("Transfer");
        bottle[1].transfer(2, bottle[2]);
        System.out.println(bottle[1].getLitres());
        System.out.println(bottle[2].getLitres());

    }
}