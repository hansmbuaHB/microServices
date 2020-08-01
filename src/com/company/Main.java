package com.company;

import java.util.EnumSet;

public class Main {

    public static void main(String[] args) {
	DateClass birthDate = new DateClass(7,24,1949);
	DateClass hired = new DateClass(3,12,1988);
	Employee employee = new Employee("Bob","Blue",birthDate,hired);
        System.out.println(employee);


/**
 *
 *
 */

        System.out.println("All books ");
        //print all books in the enum
        for (Books books: Books.values())
            System.out.printf("%-10s%-45s%s%n",books,books.getTitle(),books.getCopyrightYear());

        System.out.println("%n Display a rang of enum constants:%n");
        //print first 4 books
        for (Books books: EnumSet.range(Books.JHTP,Books.CPPHTP))
            System.out.printf("%-10s%-45s%s%n",books,books.getTitle(),books.getCopyrightYear());

    }
}
