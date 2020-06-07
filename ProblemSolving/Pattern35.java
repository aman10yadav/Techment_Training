package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		 
        System.out.println("Enter a row number upto which you want to print a pattern ");
        int number =input.nextInt();								/* Taking input from the user */
        
        /* process for making pattern */
        for(int i=0;i<number;i++)
        {
      	 for(int j=1;j<=i;j++)
      	  {
      		 System.out.print(j);
          }
               System.out.print("\n");
         }
        
        for(int i=number;i>0;i--)
        {
      	 for(int j=1;j<=i;j++)
      	  {
      		 System.out.print(j);
          }
               System.out.print("\n");
         }
	}
}
