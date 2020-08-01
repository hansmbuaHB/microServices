package com.company;

public class Main {

    public static void main(String[] args) {
	DateClass birthDate = new DateClass(7,24,1949);
	DateClass hired = new DateClass(3,12,1988);
	Employee employee = new Employee("Bob","Blue",birthDate,hired);
        System.out.println(employee);
    }
}
