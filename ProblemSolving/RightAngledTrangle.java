package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class RightAngledTrangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int base,perpendicular,hypotenuse;
		
		System.out.print("Enter sides to check for right angled triangle");
		System.out.print("\nEnter Base of the triangle :- ");
		base = input.nextInt();										/* Taking input from the user for base of the triangle*/
		
		System.out.print("Enter Perpendicular of the triangle :- ");
		perpendicular = input.nextInt();							/* Taking input from the user for perpendicular of the triangle*/

		System.out.print("Enter Hypotenuse of the triangle :- ");
		hypotenuse = input.nextInt();							/* Taking input from the user for Hypotenuse of the triangle*/
	
		 /* Checking for right angle triangle */
		if((hypotenuse*hypotenuse) == (base*base)+(perpendicular*perpendicular))
		 {
			System.out.print("The triangle is a right angle triangle.");
		  }
		else
		 {
			System.out.print("The triangle is not a right angle triangle.");
		  }
	}
}
