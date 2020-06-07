package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.io.*;
import java.util.Scanner;
public class MirrorMatrix {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		/* Calling the function for mirroring of array */
		Mirrormatrixarray();
	   }
	 
	   static void Mirrormatrixarray() {

		/* initialize reader */
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter the number of rows");
		int rowCount = reader.nextInt();					/* read the number of rows in array*/
		
		System.out.print("Enter number of columns");
		int columnCount = reader.nextInt();							/* read the number of columns in array */
	
		/* creating array */
		int[][] array = new int[rowCount][columnCount];
		
		System.out.println("Starting input of array elements...\n");
		
		/*loop to read array elements */
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < columnCount; j++) {
				array[i][j] = reader.nextInt();
			}
		}
		
		/* close reader */
		reader.close();
		
		System.out.println("Entered array is : ");
		
		/* */
		// display array elements
		displayArray(array);
		
		/* create a new array of same size as original array */
		int[][] mirrorImage = new int[rowCount][columnCount];
		
		/* iterate over the rows of actual array */
		for (int row = 0; row < rowCount; row++) { 
	        
			/* initialize column for image array */
	           int imageColumn = 0; 
	           /*  iterate over the columns of original array in reverse direction  */ 
	            for (int column = columnCount - 1; column >= 0; column--) {
			int element = array[row][column];
			mirrorImage[row][imageColumn] = element;
			/* Iincrement the image array column counter */
			imageColumn++;
		}
	   }
		System.out.println("Mirror image of array is : ");
		/* display image array */
		displayArray(mirrorImage);
	 
	   }
	 
	   
	   /* Displays the contents of the array received as parameter */
	    
	   static void displayArray(int[][] array) {
		for (int i = 0; i < array.length; i++) {
		   int[] row = array[i];
		   for (int j = 0; j < row.length; j++) {
			int element = array[i][j];
			System.out.print(element + "\t");
		   }
		   System.out.println();
		}
	   }	
	}