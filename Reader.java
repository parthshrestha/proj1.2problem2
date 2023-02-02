package com.program2;
import java.util.ArrayList;

public class Reader {
    ArrayList<String> words = new ArrayList<String>();//holds words
    ArrayList<String> clue = new ArrayList<String>();//holds clues to the words
    /* Reader constructor adds words to the words array list and uppercases
     it then it adds the coresponding clues in the same order*/
    public Reader()
    {
        // 6 words at least 5 letters long
        words.add("Birds");
        words.add("Beacon");
        words.add("Growth");
        words.add("Magnet");
        words.add("lively");
        words.add("Blossom");

        // convert every word to upper-case
        for(int i = 0; i < words.size(); i++)
        {
            words.set(i,words.get(i).toUpperCase());
            //System.out.println(words.get(i));
        }

        //generate clues
        clue.add("Round shape representing the earth");//globe
        clue.add("A source of light that guides ships");//Beacon
        clue.add("Process of increasing in size or quantity");//Growth
        clue.add("A device that attracts iron objects" );//Magnet
        clue.add("Full of energy and activity");//liveley
        clue.add("A flower that blooms on a plant");//Blossom
    }


}
