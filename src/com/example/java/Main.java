package com.example.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Enter your name:");

        Scanner sc = new Scanner(System.in);

        String enteredName;
        enteredName = sc.nextLine();

        //String enteredName = sc.nextLine();

        System.out.println("Hello " + enteredName);
    }
}
