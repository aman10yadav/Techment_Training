package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Arrays;
import java.util.Scanner;

public class CompareTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		    /* declaring variable to take input */
	       Scanner input = new Scanner(System.in);
	        
	       int size,array1[],array2[],i,j;                         /* variable declaration */
	      
	       System.out.print("Enter the size of array: ");
	       size = input.nextInt();                            /* Taking input from the user*/

	        /* Initialising the size of array */
	       array1 = new int[size];
	       array2 = new int[size];
	       
	        /* Taking input from the user to enter element*/
	       System.out.print("Enter "+size+" element for first array :- ");
	       for(i=0; i<size; i++) 
	         {
	           array1[i] = input.nextInt();
	          }
	       
	       /* Checking elements less than 15  */
	       if(size <=15)
	        {
	    	   /* Taking input from the user to enter element*/
	    	   System.out.print("Enter "+size+" element for second array :- ");
	    	   for(j=0; j<size; j++) 
	    	    {
	    		   array2[j] = input.nextInt();
	             }
	       
	    	   /* Entered first matrix */
	           System.out.println("First Matrix:");
	           for (i = 0; i < size; i++) 
	             {
	                System.out.print(array1[i]+" ");
	              }
	           System.out.print("\n");
	          
	            /* Entered second matrix */
	           System.out.println("Second Matrix:");
	           for ( j = 0; j < size; j++) 
	             {
	                System.out.print(array2[j]+" ");
	              }
	           System.out.print("\n"); 
	          
	           /* Checking for equality of array */
	           if (Arrays.equals(array1, array2))
	            {
	        	   System.out.println("After comparing both the matrix they are Same"); 
	             }
	           else										/* Checking for inequality of both matrix */
	            {
	        	   System.out.println("After comparing both the matrix they are not same"); 
	             }
	        	}
	       else											/* Checking for size greater than 15 */
	        {
	    	   System.out.println("The maximum size is 15 !!");
	         }
	}
}
