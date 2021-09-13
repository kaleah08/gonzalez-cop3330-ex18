package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Your choice: ");
        String choice = input.next();


        if( choice.equals("c") || choice.equals("C")){
            System.out.print("Please enter the temperature in Fahrenheit: ");
            String firstString = input.next();
            int fahrenheit = Integer.parseInt(firstString);

            int C = (fahrenheit - 32) * 5 / 9;
            System.out.println("The temperature in Celsius is " + C);
        }
        if( choice.equals("f") || choice.equals("F")){
            System.out.print("Please enter the temperature in Celsius: ");
            String secondString = input.next();
            int celsius = Integer.parseInt(secondString);

            int F = (celsius * 9 / 5) + 32;
            System.out.println("The temperature in Fahrenheit is " + F);
        }
    }
}
