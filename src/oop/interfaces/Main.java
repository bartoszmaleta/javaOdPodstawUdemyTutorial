package oop.interfaces;

import java.util.Arrays;  

public class Main {
    public static void main(String[] args) {
        System.out.println(interfaceName.PI);

        // interfaceName myInterface = new Employee();
        // ((Employee)myInterface).getSalary();

        // sort!
        // method "compare to" from interface "Comparable"
        int[] tab = { 3, -15, 12 };
        Arrays.sort(tab);
        System.out.println(tab[0]);

        System.out.println("--------------");

        Employee[] employees = new Employee[3];
        employees[0] = new Employee(40000);
        employees[1] = new Employee(6000);
        employees[2] = new Employee(8000);

        System.out.println(employees[0].getSalary());
        System.out.println(employees[0].compareTo(employees[1]));
        
        System.out.println("--------------");
        Arrays.sort(employees);
        System.out.println(employees[0].compareTo(employees[1]));


    }
}

interface interfaceName {
    double PI = 3.14; // public static final

    void something();

}

interface secondInterface {

}

// you can implement multiple interfaces!!!!
class Employee implements interfaceName, secondInterface, Comparable  {
    private double salary;

    @Override
    public void something() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public int compareTo(Object obj) {
        Employee receivedEmployee = (Employee)obj;
        
        if (this.salary < receivedEmployee.salary) {
            return -1;
        } else if (this.salary > receivedEmployee.salary) {
            return 1;
        }

        return -1;
    }
}

// class Programmer extends Employee {
//// only one class to extends!!!!
// }