package oop.trainingInstanceOfAndAbstractClasses;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];
        people[0] = new Employee("Bartosz", "Kowalski", 232312);
        people[1] = new Student("John", "Smith");

        people[0].getDescription();

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Person) {
                people[i].getDescription();
            } else {
                break;
            }
        }

        // or   (different for loop)

        for (Person person : people) {
            if (person instanceof Person) {
                person.getDescription();
            } else {
                break;
            }
        }
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

    @Override
    void getDescription() {
        System.out.println("I am student");
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

    }
}