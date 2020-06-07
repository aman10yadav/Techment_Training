package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class nTermSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number;
		
		System.out.print("Enter a number upto which you want the cubic series :- ");
		number = input.nextInt();										/* Taking input from the user */
		
		System.out.println("The series will be:- ");
		for(int i=1; i <=number; i++)									/* Checking whether the number is inside the n series */
		 { 
			int sum = 0;												/* Initializing the value of sum as zero each time */
			if(i <= number)												/* Checking whether the loop value is less than number given */
			 { 
				sum = sum + (i*i*i);
				System.out.print(sum+" ");
			  }
		  }

	}

}
