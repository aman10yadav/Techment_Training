package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class DivisibleBy8and3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int price;
		
		System.out.print("Enter a price to check divisibility :- ");
		price = input.nextInt();										/* Taking input from the user */
		
		if((price%8 == 0) && (price%3 == 0))							/* Checking whether number is divisible by 3 and 8*/
	     {
			System.out.print(price+" is divisible by 8 and 3");
		  }
		else															/* number is not divisible by 3 and 8*/
		 {
			System.out.print(price+" is not divisible by 8 and 3");
		
		 }
	}

}
