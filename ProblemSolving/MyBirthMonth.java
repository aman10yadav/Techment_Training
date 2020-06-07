package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class MyBirthMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int month;					
		
		System.out.print("Note:- Don't use '0' infront of the month number");
		System.out.print("\nEnter your birth month :- ");
		month = input.nextInt();										/* Taking input from the user*/
		
		switch(month)
		 {
		  case 1 :														/* Checking for first month*/
				System.out.print("Your birthday is in the month of January");
				break;
				
		  case 2 :														/* Checking for second month*/
				System.out.print("Your birthday is in the month of February");
				break;
				
		  case 3 :														/* Checking for third month*/
				System.out.print("Your birthday is in the month of March");
				break;
				
		  case 4 :														/* Checking for fourth month*/
				System.out.print("Your birthday is in the month of April");
				break;
				
		  case 5 :														/* Checking for fifth month*/
				System.out.print("Your birthday is in the month of May");
				break;
				
		  case 6 :														/* Checking for sixth month*/		
				System.out.print("Your birthday is in the month of June");
				break;
				
		  case 7 :														/* Checking for seventh month*/
				System.out.print("Your birthday is in the month of July");
				break;
				
		  case 8 :														/* Checking for eight month*/
				System.out.print("Your birthday is in the month of August");
				break;
				
		  case 9 :														/* Checking for ninth month*/
				System.out.print("Your birthday is in the month of September");
				break;
				
		  case 10 :														/* Checking for tenth month*/
				System.out.print("Your birthday is in the month of October");
				break;
				
		  case 11 :														/* Checking for eleventh month*/
				System.out.print("Your birthday is in the month of November");
				break;
				
		  case 12 :														/* Checking for twelveth month*/
				System.out.print("Your birthday is in the month of December");
				break;
				
		  default:														/* Checking for invalid month*/
				System.out.print("Invalid Month");
			
		  
		  }
	}

}
