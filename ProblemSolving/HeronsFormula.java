package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class HeronsFormula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int side1,side2,side3;
		double s,area;
		
		System.out.print("Enter side1 of a triangle :- ");
		side1 = input.nextInt();										/* Taking input from the user for side1 of the triangle*/
		
		System.out.print("Enter side2 of a triangle :- ");
		side2 = input.nextInt();										/* Taking input from the user for side2 of the triangle*/
		
		System.out.print("Enter side3 of a triangle :- ");
		side3 = input.nextInt();										/* Taking input from the user for side3 of the triangle*/
	
		/* Calculating semi-perimeter of the triangle*/
		s = ( (side1+side2+side3)/2 );
		
		/* Area of a tiangle */
		area = ( s*(s-side1)*(s-side2)*(s-side3) );
	
		System.out.print("Area of the triangle :- "+Math.sqrt(area));
	}

}
