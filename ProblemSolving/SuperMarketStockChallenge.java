package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class SuperMarketStockChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);

		/* Variable declaration */
        int size;
        
        System.out.print("Enter total no of product:");
        size = input.nextInt();									/* Taking input from the user */

        /* Initialising the size of array */
        int array[] = new int[size];

        System.out.println("Enter the quantity of product:- ");
        for(int i = 0; i < size; i++)
         {
            array[i] = input.nextInt();
          }
        int maximum = array[0]; 
        
        /* Traverse array elements from second and  compare every element with current max */    
        for (int i = 1; i <size; i++) 
         {
        	if (array[i] > maximum) 
                maximum = array[i]; 
          }
        System.out.print("The maximum value of the product is:- "+maximum);
	}
}
