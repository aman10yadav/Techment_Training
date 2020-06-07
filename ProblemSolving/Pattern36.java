package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Pattern36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		 
		/* Variable declaration */
		int number,i,j,k;
		
        System.out.println("Enter a row number upto which you want to print a pattern ");
        number =input.nextInt();									/* Taking input from the user */
 
        /* process for making pattern */
        for( i = 1; i <= number; i++)
         {	
        	/*printing incremental numbers*/
            for(j = 1; j <= (number - i + 1); j++)
             {
                System.out.print(j);
              }
            
            /*printing spaces */
            if(j == (number+1)) 
              {
            	
              }
            else
             {
                System.out.print(" ");
              }
            
            /* printing decremental numbers */
            for(k = number - i + 1; k >= 1; k--)  
             {
                System.out.print(k);
              }
            System.out.println();
             }
	}

}
