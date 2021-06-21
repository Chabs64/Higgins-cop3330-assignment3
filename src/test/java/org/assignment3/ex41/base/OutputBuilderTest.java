/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex41.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OutputBuilderTest {

    @Test
    void Does_makeNameBody_return_a_string() {

        //given
        List<String> Body = Arrays.asList("bob, can","can","dog");

        OutputBuilder Builder = new OutputBuilder();

        //when
        String actual = Builder.makeNameBody(Body);
        String expected = "bob, can\ncan\ndog\n";

        //then
        assertEquals(expected, actual);
    }

    @Test
    void Does_makeNameHeader_return_a_header() {

        //given
        List<String> Body = Arrays.asList("bob, can","can","dog");

        OutputBuilder Builder = new OutputBuilder();

        //when
        String actual = Builder.makeNameHeader(Body);
        String expected = "Total of 3 names\n-----------------\n";

        //then
        assertEquals(expected, actual);
    }
}