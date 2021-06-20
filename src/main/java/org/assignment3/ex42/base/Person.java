/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex42.base;

public class Person {

    private String FirstName = null;
    private String LastName = null;
    private String Salary = null;

    Person(String firstName, String lastName, String Salary)
    {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.Salary = Salary;
    }

    public String getFirstName()
    {
        return FirstName;
    }

    public String getSalary()
    {
        return Salary;
    }

    public String getLastName()
    {
        return LastName;
    }
}
