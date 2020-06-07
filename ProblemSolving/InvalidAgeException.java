package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

class InvalidAgeExceptions extends Exception {
	
	/* Variable declaration */
	String str1;

	/* Function call for exception */
	InvalidAgeExceptions(String str2)
	 {
		str1 = str2;
	  }
	
	public String toString()
	 {
		return ("Exception occured :- "+str1);
	  }
}

public class InvalidAgeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  try
	  {
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int age;
		
		System.out.print("Enter an age :- ");
		age = input.nextInt();										/* Taking input from the user */
	
		/* Checking condition for age grater than 18 */
		if(age>18)
		 {
			System.out.print("Welcome to Vote !!");
		  }
		else
		 {
			throw new InvalidAgeExceptions("Age must be greater than 18");
		  }
	  }
	  catch(InvalidAgeExceptions e)
	   {
		  System.out.print("InvalidAgeException\n");
		  System.out.print(e);
	   }
	}
}


