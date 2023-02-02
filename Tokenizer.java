package com.program2;
import java.util.*;
import java.util.ArrayList;

public class Tokenizer {
    ArrayList<String> tokens = new ArrayList<String>();

    public void createToken(ArrayList<String> arr) {
        for (String word : arr) {
           // System.out.println(word);
            //System.out.println(word.length());
            int i = 0;
            if (word.length() % 2 == 1)//odd length words split logic
            {
                while (i < word.length()) {
                    if (i + 2 <= word.length() - 2) {
                        //System.out.println(word.substring(i, i + 2)); used to debug what is being substringed
                        tokens.add(word.substring(i, i + 2));
                    } else if (word.substring(i).length() == 3) {
                        //System.out.println(word.substring(i));
                        tokens.add(word.substring(i));
                    }
                    i += 2;
                }
            }
            else {//even length words split logic
                for(int j = 0; i < word.length()-1; i+=2)
                {
                    //System.out.println(word.substring(i, i + 2));
                    tokens.add(word.substring(i, i + 2));
                }
            }
        }
    }
    public void showArray()
    {
        System.out.println("_______________");//for formating
        for (int i = 0; i < tokens.size(); i++) {

            System.out.print(tokens.get(i) + "\t");// each element of the array list followed my a tab
            if ((i + 1) % 4 == 0 || i == tokens.size() - 1) {// this checks for index being the fourth in the sequence to end line
                System.out.println();
            }


        }
        System.out.println("---------------");//for formating
    }
    public void randomizer() {
        for (int i = 0; i < tokens.size(); i++) {
            Collections.shuffle(tokens);// found this method on geeks for geeks https://www.geeksforgeeks.org/shuffle-or-randomize-a-list-in-java/
        }
    }
}
