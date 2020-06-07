package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class AccountLocked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int pin,attempt=3;
		
		System.out.print("Enter PIN of the ATM card :- ");
		pin = input.nextInt();										/* Taking input from the user for ATM PIN*/
		
		/* checking for invalid pin */
		while(pin!= 12345)
		 {
			System.out.print("Entered PIN of the ATM card is not correct");
			if(attempt == 0)
			{
				break;
			}
			else
			{
				System.out.print("\nEnter PIN of the ATM card :- ");
				pin = input.nextInt();								/* Taking input from the user for ATM PIN*/
				attempt = attempt - 1;
				if(pin != 12345)
				 {
				System.out.print("You have "+attempt+" left\n");
				  }
				continue;
			}
	   	  }
		
		/* checking for valid pin */
		if(pin == 12345)
		 {
			System.out.print("\nPIN accepted.You now have access to your account !!");
		  }
		else															/* checking for invalid pin */
		 {
			System.out.print("\nYou have run out of tries,account locked !!");
		  }
	}

}
