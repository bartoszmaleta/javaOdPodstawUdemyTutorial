package oop.finalKeyword;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        final double PI;
        PI = 3.14;

        Employee employee = new Employee();
        System.out.println(employee.dateOfEmployment);
    }

}

abstract class Person {

}

class Employee extends Person {

    // properties have to initialize
    // local variables do not have to be initialize at first
    // final Date dateOfEmployment = new Date();

    // or

    Employee() {
        this.dateOfEmployment = new Date();
    }

    Employee(Date date) {
        this.dateOfEmployment = date;
    }

    final Date dateOfEmployment;

    Date getDateOfEmployment() {

    // final Date getDateOfEmployment() {
    // cannot Override final method! Below will get an error 
        return this.dateOfEmployment;
    }
}

class Programmer extends Employee {
    @Override
    Date getDateOfEmployment() {
        return this.dateOfEmployment;
    }
}