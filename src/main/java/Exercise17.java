/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //initialize BAC
        double bac = 0;
        //prompt the user on whether they are male or female. 1 for male and 2 for female
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        int m_or_f = in.nextInt();
        //prompt the user to answer how many ounces of alcohol did they have
        System.out.print("How many ounces of alcohol did you have? ");
        int ounces = in.nextInt();
        //prompt the user for their weight
        System.out.print("What is your weight, in pounds? ");
        int weight = in.nextInt();
        //prompt the user for how long it has been since their last drink
        System.out.print("How many hours has it been since your last drink? ");
        int hours = in.nextInt();
        //now calculate the BAC, taking into account whether they are male or female
        if(m_or_f == 1) {
            bac = (ounces * 5.14 / weight * 0.73) - 0.015 * hours;
        }
        else if(m_or_f == 2) {
            bac = (ounces * 5.14 / weight * 0.66) - 0.015 * hours;
        }
        //give the user their BAC
        System.out.printf("Your BAC is %f%n", bac);
        //now check if the user can legally drive or not
        if(bac < 0.08) {
            System.out.print("It is legal for you to drive.");
        } else {
            System.out.print("It is not legal for you to drive.");
        }
    }
}
