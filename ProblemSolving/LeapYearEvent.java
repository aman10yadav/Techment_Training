package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class LeapYearEvent {

	public static void main(String args[]) {
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		int year;													/* Variable declaration */
		
		System.out.print("Enter a year to check for leap year :- ");
		year = input.nextInt();                                     /* Taking input from the user*/
		
		if((year%4)==0 )											/* Checking for leap year */
		  {
			System.out.println(year+" is a leap year");
		   }
		else														/* leap year is not found*/
		  {
			System.out.println(year+" is not a leap year");
		   }
		
	}
}
