package oop.trainingInstanceOfAndAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Person person;
    }
}

abstract class Person {
    String firstName;
    String lastName;
}

class Employee extends Person {
    double salary;
}

class Student extends Person {

}