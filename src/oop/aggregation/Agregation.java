package oop.aggregation;

public class Agregation {
    public static void main(String[] args) {
        Employee employee = new Employee("Bartosz", new Address("Bronowicka", 42));
        

        System.out.println(employee);

    }
}

class Employee {
    private String firstName;
    Address address;

    public Employee(String firstName, Address address) {
        this.firstName = firstName;
        this.address = address;
    }

    @Override
    public String toString() {
        // return "Employee [address=" + address + ", firstName=" + firstName + "]";

        return this.firstName + " lives at = " + address.getStreet() + " " + address.getHouseNumber();
    }
    


}

class Address {
    private String street;
    private int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    
}