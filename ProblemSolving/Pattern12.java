package com.techment.assignment.sunday1;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number,i,j;
		
		System.out.print("Enter a number to make a pattern :- ");
		number = input.nextInt();										/* Taking input from the user */
		
		/* process for making pattern */
		for(i=number;i>0;i--)
		 {
			for(j=1;j<(2*number);j++)
			{
				if(j<i)
				 {
					System.out.print(" ");
				  }
				else if(j>(2*number-i))
				 {
					continue;
				  }
				else if(j>number)
				 {
					System.out.print((2*number)-j);		
				  }
				else
			 	 {
					System.out.print(j);				
				   }
			     }
			    System.out.println();	
		    }
  }
}
