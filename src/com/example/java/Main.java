package com.example.java;

import java.util.Scanner;

public class Main {

    //This application asks you your name, and then it says Hi!
    public static void main(String[] args) {
	// write your code here

        //Print a welcome
        System.out.println("Enter your name:");

        //Dis is my robot!
        Scanner sc = new Scanner(System.in);

        //Ask the user for their name
        String enteredName;
        enteredName = sc.nextLine();

        //String enteredName = sc.nextLine();

        //Say hi to the user
        System.out.println("Hello " + enteredName);
    }
}
