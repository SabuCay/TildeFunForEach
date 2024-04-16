package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] words = {"four", "score", "and", "seven", "years", "ago"};

        ArrayList<String> wordsAL = new ArrayList<String>();

	    /*wordsAL.add("four");
		wordsAL.add("score");
		wordsAL.add("and");
		wordsAL.add("seven");
		wordsAL.add("years");
		wordsAL.add("ago");*/

        //for each loop
		for (String s:words) {
			wordsAL.add(s);
		}

        System.out.println("Words = " + wordsAL);

        //Add *
		for (int i = 0; i < wordsAL.size(); i+=2){
			wordsAL.add(i,"*");
		}
		System.out.println("Words = " + wordsAL);
        //remove *
		for (int i = 0; i < wordsAL.size(); i++){
			wordsAL.remove(i);
		}
		System.out.println("Words = " + wordsAL);

    }

}

