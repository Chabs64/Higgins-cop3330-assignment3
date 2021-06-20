/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex42.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getFirstName_return_String() {
        //given
        Person TestEmployee = new Person("Bob","Bob","Bob");

        //when
        String actual= TestEmployee.getFirstName();
        String expected = "Bob";

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getSalary_return_String() {
        //given
        Person TestEmployee = new Person("Bob","Bob","Bob");

        //when
        String actual= TestEmployee.getSalary();
        String expected = "Bob";

        //then
        assertEquals(expected, actual);
    }

    @Test
    void getLastName_return_String() {
        //given
        Person TestEmployee = new Person("Bob","Bob","Bob");

        //when
        String actual= TestEmployee.getLastName();
        String expected = "Bob";

        //then
        assertEquals(expected, actual);
    }
}