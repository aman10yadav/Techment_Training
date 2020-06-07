package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Pattern37 { 
  
    // Driver code 
    public static void main(String[] args)    {
    	// TODO Auto-generated method stub
    	
    	/* declaring variable to take input */
    	Scanner input = new Scanner(System.in);

    	/* Variable declaration */
		int row,digit,number = 1,i,j,k;
		
        System.out.println("Enter a digit to print a pattern ");
        digit =input.nextInt();										/* Taking input from the user */
        row = (digit*2) - 1;
     
        int space = row / 2;
        /* Outer for loop for number of lines */  
        for (i = 1; i <= row; i++) { 
  
            /* Inner for loop for printing space */  
            for (j = 1; j <= space; j++) 
                System.out.print(" "); 
  
            /* Inner for loop for printing number */  
            int count = number / 2 + 1; 
            for (k = 1; k <= number; k++) { 
                System.out.print(count); 
                if (k <= number / 2) 
                    count--; 
                else
                    count++; 
            } 
  
            /* for next line */  
            System.out.println(); 
            if (i <= row/ 2) 
             { 
  
                /* space decreased by 1 */  
                /* number increased by 2 */  
                space = space - 1; 
                number = number + 2; 
              } 
  
            else { 
  
                /* space increased by 1 */  
                /* number decreased by 2 */  
                space = space + 1; 
                number = number - 2; 
            } 
  
    }
        
    }
}

