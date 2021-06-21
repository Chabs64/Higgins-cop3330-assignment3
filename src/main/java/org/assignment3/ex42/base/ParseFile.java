/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

//String[] Array = input.split(",");
//.valueOf(charArray, starting index, ending index)
//.substring(up to 3, not including 6)
package org.assignment3.ex42.base;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParseFile {
    private final Scanner fileReader;

    public ParseFile(Scanner fileReader) {
        this.fileReader = fileReader;
    }

    // make array of person to hold file contents
    public List<Person> readFile(){
        List<Person> BodyArray = new ArrayList<Person>();

        while(fileReader.hasNext())
        {
            String[] text = fileReader.nextLine().split(",");
            Person Employee = new Person(text[0], text[1], text[2]);
            BodyArray.add(Employee);
        }

        return BodyArray;
    }



    //process file into string.
    public String makeBodyString(List<Person> PersonList)
    {
        String BodyString = String.format("%-9s %-9s %-9s\n", PersonList.get(0).getFirstName(), PersonList.get(0).getLastName(), PersonList.get(0).getSalary());
        for (int i=1; i<PersonList.size(); i++) {
            BodyString = BodyString.concat(String.format("%-9s %-9s %-9s\n", PersonList.get(i).getLastName(), PersonList.get(i).getFirstName(), PersonList.get(i).getSalary()));
        }

        return BodyString;
    }

    //make and return header
    public String getHeader()
    {
        String HeaderString = "Last      First     Salary\n" +
                "--------------------------\n";
        return HeaderString;
    }
}
