/*
 * Copyright (c) 2021.
 *   UCF COP3330 Summer 2021 Assignment 3 Solution
 *   Copyright 2021 Chad Higgins
 */

//String[] Array = input.split(",");
//.valueOf(charArray, starting index, ending index)
//.substring(up to 3, not inlcudeing 6)
package org.assignment3.ex42.base;

public class ParseFile {


    //make constructor
    /*
    public ParseFile(FILE) {
        this.file = FILE;
    }
    */

    // make array of maps to hold file contents
    public void readFile(){}

    //process file into string.
    public String makeBodyString()
    {
        String BodyFileString = "";
        return BodyFileString;
    }

    //make and return header
    public String getFileHeader()
    {
        String FileHeaderString = "Last      First     Salary\n" +
                "--------------------------";
        return FileHeaderString;
    }
}
