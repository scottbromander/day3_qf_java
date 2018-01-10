package com.example.java;

import java.util.Scanner;

public class Main {

    //This application asks you your name, and then it says Hi!
    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter your name:");

        //Dis is my robot!
        Scanner sc = new Scanner(System.in);

        String enteredName;
        enteredName = sc.nextLine();

        //String enteredName = sc.nextLine();

        System.out.println("Hello " + enteredName);
    }
}
