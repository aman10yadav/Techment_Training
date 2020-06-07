package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number,i,j;
		
		System.out.print("Enter a number to make a pattern :- ");
		number = input.nextInt();										/* Taking input from the user */
		
		/* process for making pattern */
		for(i=1; i<=number; i++)
		 {
			int sum = 0;
			for(j=i; j<=number; j++)
			 {
				sum = sum + 1 ;
				System.out.print(sum);
			  }
			System.out.print("\n");
		 }
	}
}
