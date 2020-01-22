package oop.nestedClasses;

public class Main {
    public static void main(String[] args) {
        A outsideClass = new A();
        A.B nestedClassB = outsideClass.new B();

        // if static, then you can create 
        // without creating outsideClass
        A.C nestedClassC = new A.C();
        
    }
}


class A {
    A() {
        System.out.println("Outside class constructor");
    }
    
    class B {
        // cannot create static variables here
        // because it is not static class
        B() {
            System.out.println("B = Nested class constructor");
        }
        void something() {
            test = 5;
        }

        private int temp;
    }

    void something2() {
        // wont work, cant reach "temp" from here!!!
        // temp = 2;

        // solution:
        B obj = new B();
        obj.temp = 3;
        
        
    }

    static class C {
        // can create static variables here
        C() {
            System.out.println("C = Nested class constructor");
        }
    }

    private int test;
}