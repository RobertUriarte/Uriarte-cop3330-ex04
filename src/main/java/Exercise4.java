/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Robert Uriarte
*/

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an adjective (Present Tense) : ");
        String adj = scan.nextLine();
        System.out.print("Enter a verb (Present Tense) : ");
        String verb = scan.nextLine();
        System.out.print("Enter an adverb (Present Tense) : ");
        String adverb = scan.nextLine();
        System.out.print("Enter a noun (Present Tense) : ");
        String noun = scan.nextLine();

        System.out.print("The " + adj + " " + noun + " " +  verb + " very " + adverb + ". Amazing adlib!");


    }
}
