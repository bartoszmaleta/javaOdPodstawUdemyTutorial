package oop;

public class OOP_basics {
    // Properties
    // Methods
    public static void main(String[] args) {

        new Point();

        Point p;

        p = new Point();

        p.x = 5;
        p.y = 80;

        System.out.println("p.x = " + p.x);
        System.out.println("p.y = " + p.y);

        System.out.println("------------------");
        Point p2 = new Point(10, 4);
        System.out.println("p2.x = " + p2.x);
        System.out.println("p2.y = " + p2.y);

    }
}

class Point {
    Point() {
        System.out.println("Initalize default constructor");
        // x = 20;
        // y = 20;
    }

    Point(int x, int y) {
        System.out.println("Constructor with 2 parameters");
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}