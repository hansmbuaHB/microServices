package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DateClass birthDate = new DateClass(7, 24, 1949);
        DateClass hired = new DateClass(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birthDate, hired);
        System.out.println(employee);


/**
 *
 *Enum testing
 */

        System.out.println("All books ");
        //print all books in the enum
        for (Books books : Books.values())
            System.out.printf("%-10s%-45s%s%n", books, books.getTitle(), books.getCopyrightYear());

        System.out.println("%n Display a rang of enum constants:%n");
        //print first 4 books
        for (Books books : EnumSet.range(Books.JHTP, Books.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", books, books.getTitle(), books.getCopyrightYear());

        /**
         * Static testing
         */


        System.out.println("Static testing");

        System.out.printf("Employees before instantiation: %d%n", EmployeeCount.getCount());

        //creating two new employees means count will be = 2


        List list = new ArrayList<EmployeeCount>() {

        };


        EmployeeCount[] employeeCounts = {new EmployeeCount("hans", "mbua"),
                new EmployeeCount("jeo", "ben"),
                new EmployeeCount("ben", "vandi")};


        for (EmployeeCount employeeCount1 : employeeCounts)
            System.out.printf("Employees after instantiation: %d%n", EmployeeCount.getCount());

        System.out.println("getting the firstnames of the employees");

        for (int i = 0; i < employeeCounts.length; i++) {
            EmployeeCount employeeCount1 = employeeCounts[i];
            String nameofemploy = employeeCount1.getFirstName();
            System.out.println("there first names are: " + nameofemploy);

        }

        System.out.println("testing GUI here");

        DrawPanel panel = new DrawPanel();

        JFrame jframe = new JFrame();
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(panel);
        jframe.setSize(300, 300);
        jframe.setVisible(true);


    }


}
