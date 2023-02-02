package com.program2;

public class Main {

    public static void main(String[] args) {
	    Reader r = new Reader();//instantiation of Reader class
        Tokenizer token = new Tokenizer();//instantiation of Tokenizer class
        token.createToken(r.words);
        System.out.println("**This is what is inside token arrayList before randomization**");
        token.showArray();
        token.randomizer(); //randomizes the order of elements inside the token array list
        System.out.println("**Now tokens array has been randomized**");
        PuzzlePrint puzzle = new PuzzlePrint(token.tokens, r.clue, r.words);//instantiation of PuzzlePrint class

    }
}
