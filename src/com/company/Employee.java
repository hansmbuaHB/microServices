package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private DateClass birthDate;
    private DateClass hireDate;

    public Employee(String firstName, String lastName, DateClass birthday, DateClass hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthday;
        this.hireDate = hireDate;
    }

    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }


}
