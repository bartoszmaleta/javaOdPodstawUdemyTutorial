package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        System.out.println(interfaceName.PI);


        interfaceName myInterface = new Employee();

        ((Employee)myInterface).getSalary();

        

    }
}

interface interfaceName {
    double PI = 3.14; // public static final

    void something();

}

interface secondInterface {

}

// you can implement multiple interfaces!!!!
class Employee implements interfaceName, secondInterface {
    
    @Override
    public void something() {

    }

    private double salary;
    public double getSalary() {
        return this.salary;
    }
}

class Programmer extends Employee {
    // only one class to extends!!!!
}