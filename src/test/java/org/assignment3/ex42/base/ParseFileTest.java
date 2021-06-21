/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex42.base;

import org.assignment3.ex41.base.OutputBuilder;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ParseFileTest {

    @Test
    void Does_makeBodyString_return_a_proper_string() {

        //given
        Scanner FakeScanner = new Scanner(System.in);
        ParseFile TestText = new ParseFile(FakeScanner);
        Person TestEmployee = new Person("Bob","Doe","000");
        List<Person> TestList = new ArrayList<>();
        TestList.add(TestEmployee);

        //when
        String actual = TestText.makeBodyString(TestList);
        String expected = String.format("%10s %10s %10s", "Bob", "Doe", "000");

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Does_getHeader_return_a_header() {

        //given
        Scanner FakeScanner = new Scanner(System.in);
        ParseFile TestText = new ParseFile(FakeScanner);

        //when
        String actual = TestText.getHeader();
        String expected = "Last      First     Salary\n--------------------------\n";

        //then
        assertEquals(expected, actual);
    }
}