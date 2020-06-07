package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class ArithmeticExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try
		  {
			/* declaring variable to take input */
			Scanner input = new Scanner(System.in);
			
			/* Variable declaration */
			int integer1,integer2;
			
			System.out.print("Enter first digit :- ");
			integer1 = input.nextInt();										/* Taking input from the user */
		
			System.out.print("Enter second digit :- ");
			integer2 = input.nextInt();										/* Taking input from the user */
	
			/* Dividing both the digits */
			double divide = integer1/integer2 ;
			
			 System.out.print(divide);
		  }
		 catch(ArithmeticException e)									/* Handling exception in catch block */
		   {
			  System.out.print("Division is not possible !!");
		   }		
	}

}
