/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Pedro Henrique Sotto-Mayor Pereira da Silva
 */
package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        int age=0;

        System.out.print("What is your age? ");
        age=sc.nextInt();

        if(age >=18){
            System.out.println("You are old enough to legally drive.");
        }
        else{
            System.out.println("You are not old enough to legally drive.");
        }


    }
}