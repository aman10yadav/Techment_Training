package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class sumoftheseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
	    double sum = 0;
	    int number;

	    System.out.println("1/1! + 2/2! + 3/3! + ..N/N!");
	    System.out.print("Enter the no. of terms in series: ");
	    number = input.nextInt();									/* Taking input from the user */
						
	    sumoftheseries object = new sumoftheseries();
	    for(int i = 1; i <= number; i++)
	      {
	         sum = sum + (double)i / (object.fact(i));
	       }
	    System.out.println("Sum of series:"+sum);
	    }

		/* Calculating factorial */
	    int fact(int number)
	    {
	        int flag = 1;

	        while(number > 0)
	         {
	            flag = flag * number;
	            number--;
	          }
	        return flag;

	    }
}
