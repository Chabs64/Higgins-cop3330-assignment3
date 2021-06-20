/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

package org.assignment3.ex41.base;

import java.util.List;

public class OutputBuilder {

    public String makeNameBody(List<String> names) {
        String statement2 = names.get(0).concat("\n");
        for (int i=1; i<names.size(); i++) {
            statement2 = statement2.concat(names.get(i)+"\n");
        }
        return statement2;
    }

    public String makeNameHeader(List<String> names) {
        String statement1 = String.format("Total of %d names\n" +
                "-----------------", names.size());
        return statement1;
    }
}
