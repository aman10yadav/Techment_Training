package com.techment.assignment.sunday1;

/* Declaration of import libraries */
import java.util.Scanner;

public class TriangleCanBeFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* declaring variable to take input */
		Scanner  input = new Scanner(System.in);
		
		 /* variable declaration */
		int side1,side2,side3;
		
		System.out.println("Enter three side of triangles let say(ABC): ");
		System.out.println("Enter first side of triangles let say(AB): ");
		side1 = input.nextInt();										/* Taking input from the user*/
		
		System.out.println("Enter second side of triangles let say(BC): ");
		side2 = input.nextInt();										/* Taking input from the user*/
		
		System.out.println("Enter third side of triangles let say(AC): ");
		side3 = input.nextInt();										/* Taking input from the user*/
		
		/* Checking the condition for triangle */
		if( ((side1 + side2) > side3) && ( (side2 + side3) > side1 ) && ( (side1 + side3) > side2 ) )
		 {
			System.out.println("The sides you entered is a valid triangle");
		  }
		else					/* Checking for non-triangle condition */
		{
			System.out.println("The sides you entered is not a valid triangle");
		}
	}

}
