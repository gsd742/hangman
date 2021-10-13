package com.company;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> words = new ArrayList<String>();
        words.add("cat");
        words.add("dog");
        words.add("pig");
        words.add("cow");
        words.add("kid");
        int choice = rand.nextInt(words.size());
        String answer = words.get(choice);
        System.out.println(answer);
        System.out.println("the word is "+answer.length()+" letters long");
        System.out.println("what letter do u want to guess?");
        String letter = input.nextLine();
        for (int i = 0 ; i < 6 ; i++) {
            if (answer.contains(letter)) {
                i=i-1;
                System.out.println("there is a " + letter + " in place " + (answer.indexOf(letter) + 1));
                System.out.println("try another letter");
                letter = input.nextLine();
            }
            else{
                System.out.println("the letter "+ letter + " isn't in the word");
                System.out.println("try another letter");
                letter = input.nextLine();
            }
        }


    }
}
