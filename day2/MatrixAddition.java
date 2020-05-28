package com.techment.assignment.day2;


/* Declaration of import libraries */
import java.util.Scanner;


public class MatrixAddition {

	public static void main(String[] args) {
	
		 /* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		 /* Variable declaration */
		int rows1, columns1, rows2, columns2;

	        
	    System.out.print("Enter number of rows in first matrix:");
	    rows1 = input.nextInt();  					// Taking input from user for row1

	    System.out.print("Enter number of columns in first matrix:");
        columns1 = input.nextInt();					// Taking input from user for column1

	    System.out.print("Enter number of rows in second matrix:");
	    rows2 = input.nextInt();				// Taking input from user for row2

	    System.out.print("Enter number of columns in second matrix:");
	    columns2 = input.nextInt();				// Taking input from user for column2

	     /* Checking the equality of rows to rows and columns to columns */
	    if (rows1 == rows2 && columns1 == columns2) 
	      {
	          int array1[][] = new int[rows1][columns1];
	          int array2[][] = new int[rows2][columns2];
	          int array3[][] = new int[rows2][columns2];

	           /* Taking input from user for first matrix  */
	          System.out.println("Enter all the elements of first matrix:");
	          for (int i = 0; i < rows1; i++) 
	            {
	              for (int j = 0; j < columns1; j++) 
	                {
	                    array1[i][j] = input.nextInt();
	                 }
	             }

	           /* Taking input from user for second matrix  */
	          System.out.println("Enter all the elements of second matrix:");
	          for (int i = 0; i < rows2; i++) 
	            {
	               for (int j = 0; j < columns2; j++) 
	                {
	                    array2[i][j] = input.nextInt();
	                 }
	             }
	          
	          
	           /* Entered first matrix */
	          System.out.println("First Matrix:");
	          for (int i = 0; i < rows1; i++) 
	            {
	                for (int j = 0; j < columns1; j++) 
	                  {
	                    System.out.print(array1[i][j]+" ");
	                   }
	                System.out.println("");
	            }
	          System.out.println("\n");
	          
	          
	           /* Entered second matrix */
	          System.out.println("Second Matrix:");
	          for (int i = 0; i < rows2; i++) 
	            {
	                for (int j = 0; j < columns2; j++) 
	                  {
	                    System.out.print(array2[i][j]+" ");
	                   }
	                System.out.println("");
	            }
	          System.out.println("\n");
	          
	          /* Adding both matrix */
	           for (int i = 0; i < rows1; i++) 
	             {
	                for (int j = 0; j < columns2; j++) 
	                 {
	                    for (int k = 0; k < columns1; k++) 
	                     {
	                        array3[i][j] = array1[i][j] + array2[i][j];
	                      }
	                  }
	              }
	            
	           /* After adding the given matrix  */
	            System.out.println("Matrix after addition:");
	            for (int i = 0; i < rows1; i++) 
	              {
	                for (int j = 0; j < columns2; j++) 
	                  {
	                    System.out.print(array3[i][j]+" ");
	                   }
	                System.out.println("");
	               }
	         }
	    	else           /* If there is no equality of rows to rows and columns to columns */
	         {
	            System.out.println("As rows1 does not equal to row2 or column1 does not equal to column2");
	          }
	}
}