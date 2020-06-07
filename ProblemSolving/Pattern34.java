package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		 Scanner input = new Scanner(System.in);
		 
         System.out.println("Enter a row number upto which you want to print a pattern ");
         int number =input.nextInt();									/* Taking input from the user */
         
         /* process for making pattern */
         for(int i=number;i>0;i--)
          {
        	 int temp = number;
        	 for(int j=1;j<=i;j++)
        	  {
        		 System.out.print(temp);
                 temp = temp - 1;
               }
                 System.out.print("\n");
     }
	}
}
