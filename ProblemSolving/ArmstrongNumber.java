package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number,sum=0,remainder,temp;
		
		System.out.print("Enter a number to check for armstrong number :- ");
		number = input.nextInt();										/* Taking input from the user for first number */
		
		temp = number; 													/* Holding the value of given number in temporary variables  */
		
		while(number>0)												
		 {
			remainder = number%10;
			sum = sum + (remainder*remainder*remainder);
			number = number/10;
		 }
		
		if(temp == sum)													/* Checking whether the number is equal to the cubes of their digits  */
		 {
			System.out.print(temp+" is an armstrong number.");
		  }
		else															/* Entered number is not equal to the cubes of its digit */
		 {
			System.out.print(temp+" is not an armstrong number.");
		   }
	}

}
