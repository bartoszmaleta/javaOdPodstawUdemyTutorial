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

        System.out.println("-----------");

        if (point.equals(point)) {
            System.out.println("point Equals point");
        }

        System.out.println("-----------");

        System.out.println(point);

        System.out.println("-----------");

        Object[] points = new Point[4];
        points[0] = new Point(2, 8);
        points[1] = new Point(6, 5);
        points[2] = new Point(4, 4);
        points[3] = new Point(99, 1);

        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
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
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        
        Point objectReceived = (Point) obj;

        // if (this.x == objectReceived.x && this.y == objectReceived.y) {
            // return true;
        // }
        // 
        // return false;

        // or

        return (this.x == objectReceived.x && this.y == objectReceived.y);
    }


    // if this method is commented
    // i will get references
    @Override
    public String toString() {
        return "X = " + getX() + ", Y = " + getY();
    }
}

