package org.assignment3.ex42.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Chad Higgins
 */

/*
Exercise 42 - Parsing a Data File
Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them.
CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself;
name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints
Write your own code to parse the data. Don't use a CSV parser.

Challenges
Make each column one space longer than the longest value in the column.
Format the salary as currency with dollar signs and commas.
Sort the results by salary from highest to lowest.
Rework your program to use a CSV parsing library and compare the results.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ParseDataFile {
    private static final File Input42 = new File("exercise42_input.txt");
    private static Scanner FileReader;

    public static void main(String[] args) {

        //read Input File(`exercise42_input.txt`) see if it exists
        try {
            FileReader = new Scanner(Input42);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

        //make receiving strings
        String Header;
        String Body;

        //make ParseFile instance, pass input File
        ParseFile MainText = new ParseFile(FileReader);

        //get output header
        Header = MainText.getHeader();

        //get output body
        Body = MainText.makeBodyString(MainText.readFile());

        //close InputFile
        FileReader.close();

        //printTable, with Header and Body
        PrintTable(Header + Body);

    }

    public static void PrintTable(String s) {
        System.out.println(s);
    }
}
