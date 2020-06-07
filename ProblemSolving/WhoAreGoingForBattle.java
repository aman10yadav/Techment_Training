package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class WhoAreGoingForBattle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int firstnumber,lastnumber;
		
		System.out.print("Enter first soldier number :- ");
		firstnumber = input.nextInt();										/* Taking input from the user for first number */
		
		System.out.print("Enter last soldier number :- ");
		lastnumber = input.nextInt();										/* Taking input from the user for last number */
		
		if(firstnumber <= lastnumber)    									/* Checking whether first number is less than the last number  */
		 {
		   for(int i=firstnumber; i<=lastnumber; i++)						/* Checking number between first and last number  */
		     {
				System.out.print("A soldier numbered "+i+" should go with the king\n");
		      }
		  }
		else																/* Checking whether first number is less than last number */
		 {
			System.out.print("Fist number should be less than or equal to last number.");
		  }
	}

}
