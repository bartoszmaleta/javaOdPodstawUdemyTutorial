package oop.classObject;

public class Main {
    public static void main(String[] args) {
        Object object = new Point(7, 23);
        
        Point point = new Point(4, 10);
        Point point2 = new Point(2, 54);
        Point point3 = new Point(4, 10);

        System.out.println(point.getClass());

        if (point == point2) {
            System.out.println("Are equal???");
        }
        // nothing will appear, becase these are references

        if (point.equals(point2)) {
            System.out.println("point Equals point2");
        }

        if (point.equals(point3)) {
            System.out.println("point Equals point3");
        }


        
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

    // override method of Super class Object
    @Override
    public boolean equals(Object o) {
        Point objectReceived = (Point) o;

        // if (this.x == objectReceived.x && this.y == objectReceived.y) {
            // return true;
        // }
        // 
        // return false;

        // or

        return (this.x == objectReceived.x && this.y == objectReceived.y);
    }
    
}

