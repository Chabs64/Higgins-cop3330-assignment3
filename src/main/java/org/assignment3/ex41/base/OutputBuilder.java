/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex41.base;

import java.util.List;

public class OutputBuilder {

    public String makeNameBody(List<String> names) {
        String statement2 = "";
        for (String name : names) {
            statement2.concat(name).concat("\n");
        }
        return statement2;
    }

    public String makeNameHeader(List<String> names) {
        String statement1 = String.format("Total of %d names\n" +
                "-----------------", names.size());
        return statement1;
    }
}
