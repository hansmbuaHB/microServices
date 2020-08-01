package com.company;

public enum Books {

    JHTP("how to program in java","2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");

    private final String title; // book title
    private final String copyrightYear;

    Books (String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    public String getTitle() {

        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }
}
