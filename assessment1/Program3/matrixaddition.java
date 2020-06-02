package com.techment.assessment1;

import java.util.Scanner;

public class matrixaddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int row1,row2,column1,column2,array1[][],array2[][],arrayadd[][],i,j,k;

	        
	    System.out.print("Enter number of rows for first matrix     :");
	    row1 = input.nextInt();  					
	    
	    System.out.print("Enter number of columns for first matrix  :");
        column1 = input.nextInt();					

	    System.out.print("Enter number of rows for second matrix    :");
	    row2 = input.nextInt();				

	    System.out.print("Enter number of columns for second matrix :");
	    column2 = input.nextInt();				

	    if (row1 == row2 && column1 == column2) 
	      {
	          array1 = new int[row1][column1];
	          array2 = new int[row2][column2];
	          arrayadd = new int[row2][column2];

	          System.out.println("Enter all the elements of first matrix:");
	          for (i = 0; i < row1; i++) 
	            {
	              for (j = 0; j < column1; j++) 
	                {
	                    array1[i][j] = input.nextInt();
	                 }
	             }

	          System.out.println("Enter all the elements of second matrix:");
	          for (i = 0; i < row2; i++) 
	            {
	               for (j = 0; j < column2; j++) 
	                {
	                    array2[i][j] = input.nextInt();
	                 }
	             }
	          
	           for (i = 0; i < row1; i++) 
	             {
	                for (j = 0; j < column2; j++) 
	                 {
	                    for (k = 0; k < column1; k++) 
	                     {
	                        arrayadd[i][j] = array1[i][j] + array2[i][j];
	                      }
	                  }
	              }
	            
	            System.out.println("Matrix after addition:");
	            for (i = 0; i < row1; i++) 
	              {
	                for (j = 0; j < column2; j++) 
	                  {
	                    System.out.print(arrayadd[i][j]+" ");
	                   }
	                System.out.println("");
	               }
	          }
	    	else      
	         {
	            System.out.println("As rows1 does not equal to row2 or column1 does not equal to column2 addition is not possible !!");
	          }
	 }
}
