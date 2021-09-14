/*
 *  UCF COP3330 Fall 2021 Assignment 8 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        int people, pizzas, slices, slice_total;
        System.out.print("How many people? ");
        people = in.nextInt();
        System.out.print("How many pizzas do you have? ");
        pizzas = in.nextInt();
        System.out.print("How many slices per pizza? ");
        slices = in.nextInt();
        slice_total = slices * pizzas;

        System.out.println(people + " people with " + pizzas + " pizzas (" + slice_total + " slices)");
        System.out.println("Each person gets " + (slice_total/people) + " pieces of pizza.");
        System.out.println("There are " + (slice_total%people) + " leftover pieces.");

        in.close();
    }
}