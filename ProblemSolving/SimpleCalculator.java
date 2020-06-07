package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int integer1,integer2;
		char operator;
		
		System.out.print("Enter First Number :- ");
		integer1 = input.nextInt();										/* Taking input from the user for first number */
		
		System.out.print("Enter operator (+,-,*,/) for mathematical operation :- ");
		operator = input.next().charAt(0);									/* Taking input from the user for operator */
		
		System.out.print("Enter Second Number :- ");
		integer2 = input.nextInt();										/* Taking input from the user for second number */
		
		 /* Applying switch case for mathematical operation */
		switch(operator)
		 {
		  case '+' :														/* Checking for adding the numbers*/
				System.out.print("The addition of two number is :- "+(integer1 + integer2));
				break;

		  case '-' :														/* Checking for subtracting the numbers*/
				System.out.print("The substraction of two number is :- "+(integer1 - integer2));
				break;

		  case '*' :														/* Checking for multiplying the numbers*/
				System.out.print("The multiplication of two number is :- "+(integer1 * integer2));
				break;

		  case '/' :														/* Checking for dividing the numbers*/
				System.out.print("The division of two number is :- "+(integer1 / integer2));
				break;

		  default :														/* Checking for other operations */
				System.out.print("Only addition,substrction,multiplication and division is possible and the number should be integer");
	}

  }
}
