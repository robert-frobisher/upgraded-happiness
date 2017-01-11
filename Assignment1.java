/************************************
 * Name: Kasey Kautenburger
 * Title: Assignment1.java
 * Author: Kasey Kautenburger
 * Description: Calculate the amount to leave for a tip at a restaurant
 * Ask the user for amount of the bill, percent they would like to tip
 * Program should accept tip as an integer value
 * Time spent:
 * Date: 1/10/17
 ************************************/


/*
 * Part 1: Compile and run
 * (a) Change TempConverter to tempConverter.
 * (b) Remove the first quotation mark in the first string literal in the first System.out.println( ) statement.
 * (c) Remove the semicolon at the end of the first println( ) statement.
 * (d) Remove the last brace in the program.
 * (e) Change the variable name fahrenheitTemp to fahrenheit in any one place in the code.
 */


/*
 * Part 2: Arithmetic Expressions
 * 1a.
 * 1b.
 * 1c. 
 * 2a.
 * 2b.
 * 2c.
 * 2d.
 * 2e.
 * 2f.
 * 2g.
 */


package test1;

import java.util.Scanner;

public class Assignment1
{
	public static void main (String[] args)
	{
		// Declare variables
		double billTotal;
		int tip;
		
		// Create new scanner object to receive input from user
		Scanner input = new Scanner(System.in);
		
		// Prompt user for amount of bill
		System.out.print("Enter total amount of bill: ");
		billTotal = input.nextDouble();
		
		// Prompt user for percent to tip, accept value as int
		System.out.print("Enter the percentage you would like to tip: ");
		tip = input.nextInt();
		
		// Return tip amount to user
		System.out.print("");
		
		// TTTTTTTTTEEEEEEEEESSSSSSSSSTTTTTTTTTTTT
	}
}