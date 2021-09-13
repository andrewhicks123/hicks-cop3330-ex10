/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Andrew Hicks
 */


package com.example.Main;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double subtotal = 0;
        double tax = 0;
        double total = 0;
        int[] prices = new int[3];
        int[] quantity = new int[3];

        for(int i = 0; i <= 2; i++){
            System.out.print("What is the price of item " + (i+1) + ": ");
            prices[i] = input.nextInt();
            System.out.print("What is the quantity of item " + (i+1) + ": ");
            quantity[i] = input.nextInt();
        }
        for(int i = 0; i <= 2; i++){
            subtotal = subtotal + (prices[i]*quantity[i]);
        }
        tax = (subtotal * .055);
        total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);




    }
}

