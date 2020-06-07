package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number;
		
		System.out.print("Enter a number to find table of that number :- ");
		number = input.nextInt();										/* Taking input from the user to find the table of that number*/
		
		/* Calculating table for given number */
		System.out.print("Table of "+number);
		for(int i=1; i<11; i++)
		 {
			System.out.print("\n"+number+" * "+i+" = "+(number*i));
		  }
	}

}
