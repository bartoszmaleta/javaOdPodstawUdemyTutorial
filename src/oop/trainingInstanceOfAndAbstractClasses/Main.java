package oop.trainingInstanceOfAndAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Person[] person = new Person[4];
        person[0] = new Employee("Bartosz", "Kowalski", 232312);
        person[1] = new Student("John", "Smith");

        person[0].getDescription();

    }
}

abstract class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    abstract void getDescription(); 
}

class Employee extends Person {
    double salary;

    Employee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    @Override
    void getDescription() {
System.out.println("I am employee");
System.out.println("firstName = " + firstName);
System.out.println("lastName = " + lastName);
System.out.println("Salary = " + salary);
    }

}

class Student extends Person {
   Student(String firstName, String lastName) {
       super(firstName, lastName);
   } 

   @Override void getDescription() {
    System.out.println("I am student");
    System.out.println("firstName = " + firstName);
    System.out.println("lastName = " + lastName);
    
   }
}