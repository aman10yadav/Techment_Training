package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class ReversePyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number,i,j,temp;
		
		System.out.print("Enter a number to make a pattern of reverse pyramid :- ");
		number = input.nextInt();										/* Taking input from the user */
		
		temp = number;

		/* process for making pattern */
		for(i=number; i>=1; i--)
		{
			for(j=number-i; j>=1; j--)
			 {
				System.out.print(" ");
			  }
			for(j=1; j<=i; j++)
			 {
				System.out.print(j);
			  }
			for(j=i-1; j>=1; j--)
			 {
				System.out.print(j);
			  }
			System.out.print("\n");
		 }
		
	}

}
