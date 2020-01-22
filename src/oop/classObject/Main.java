package oop.classObject;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(4, 10);

        System.out.println(point.getClass());
    }
}

class Point {
    private int x;
    private int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

