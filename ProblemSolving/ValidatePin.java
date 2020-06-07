package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class ValidatePin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int pin;
		
		System.out.print("Enter PIN number of this ATM Card :- ");
		pin = input.nextInt();										/* Taking input from the user for ATM PIN*/
		
		while(pin != 12345)
		 {
			System.out.print("Entered pin is not correct.");
			System.out.print("\nEnter PIN number of this ATM Card :- ");
			pin = input.nextInt();										/* Taking input from the user for ATM PIN*/	
		  }
		
		if(pin == 12345)											/* When pin is correct */
		 {
			System.out.print("Entered PIN is accepted !!");
		  }
	}

}
