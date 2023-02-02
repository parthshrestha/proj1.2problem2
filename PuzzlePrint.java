package com.program2;
import java.util.ArrayList;
public class PuzzlePrint {
    public PuzzlePrint(ArrayList<String> arr, ArrayList<String> clues ,ArrayList<String> answers ) {
        System.out.println("Tokens:");
        printTable(arr);// prints a table of given arrayList
        System.out.println("");
        System.out.println("Clues:");
        for(int i = 0; i < clues.size(); i++)
        {
            System.out.println("Clue# "+ (i+1) +": "+ clues.get(i));// numbered list of the clues
        }
        System.out.println("");
        System.out.println("Answer Key:");
        for(int i = 0; i < answers.size(); i++)
        {
            System.out.println(i+1+".) "+answers.get(i)); // numbered list of the answer key
        }

    }

    public void printTable(ArrayList<String> arr) {
        System.out.println("_______________");//for formating
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + "\t");// each element of the array list followed my a tab
            if ((i + 1) % 4 == 0 || i == arr.size() - 1) {// this checks for index being the fourth in the sequence to end line
                System.out.println();
            }


        }
        System.out.println("---------------");//for formating

    }
}
