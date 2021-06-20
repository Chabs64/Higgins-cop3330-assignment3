package org.assignment3.ex41.base;

/*
 *  UCF COP3330 Summer 2021 Assignment 3 Solution
 *  Copyright 2021 Chad Higgins
 */

/*
Exercise 41 - Name Sorter
Alphabetizing the contents of a file, or sorting its contents,
is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and
sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
Don't hard-code the number of names.

Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class NameSorter {
    private static final File Input41 = new File("exercise41_input.txt");
    private static Scanner FileReader;


    public static void main(String[] args) {

        //get a file, and check if it exists (make it a file...)
        try {
                FileReader = new Scanner(Input41);
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found");
                e.printStackTrace();
        }

        //read File(`exercise41_input.txt`) and place it into a array
        List<String> names = null;
        while(FileReader.hasNext()) {

            names.add(FileReader.nextLine());

        }
        //Sort Array alphabetically, pass names
        names.sort();

        OutputBuilder Build = new OutputBuilder();

        //get array length and save it to a string "statement 1", transfer to new class
        //Total of 7 names
        //-----------------
        String statement1 = Build.makeNameHeader(names);

        //enter the array of maps into string "statement 2", transfer to new class
        //Johnson, Jim
        //Jones, Aaron
        //Jones, Chris
        //Ling, Mai
        //Swift, Geoffrey
        //Xiong, Fong
        //Zarnecki, Sabrina
        String statement2 = Build.makeNameBody(names);


        //enter it into an output File(`exercise41_output.txt`)
        try(Formatter object = new Formatter("exercise41_output.txt"))
        {
            object.format(statement1 + statement2);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
