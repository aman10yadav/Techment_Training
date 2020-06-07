package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class SuperMarketTotalStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
        Scanner input = new Scanner(System.in);

        /* Variable declaration */
        int size, sum = 0;
        
        System.out.print("Enter total no of elements:");
        size = input.nextInt();										/* Taking input from the user */

        /* Initialising the size of array */
        int elements[] = new int[size];

        System.out.println("Enter all the elements:");

        for(int i = 0; i < size; i++)
        {
            elements[i] = input.nextInt();
            sum = sum + elements[i];
        }
        System.out.println("The sum of the products is: "+sum);
	}

}
