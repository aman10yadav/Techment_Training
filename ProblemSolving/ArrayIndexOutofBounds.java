package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class ArrayIndexOutofBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* declaring variable to take input */
	    Scanner input = new Scanner(System.in);
	        
	    int size,array[],index,i,j;                         /* variable declaration */
	    try 
	     {
	       System.out.print("Enter the size of array: ");
	       size = input.nextInt();                            /* Taking input from the user*/

	       /* Initializing the size of array */
	       array = new int[size];
	       
	       /* Inserting the values in array */
	       for(i=0; i<size; i++)
	       {
	    	   array[i] = input.nextInt();
	       }
	       /* Taking input as index to search the element in array */
	       System.out.print("Enter the index to find the value: ");
	       index = input.nextInt();
	       
	       System.out.print("The item at index "+index+" is :- "+array[index]);
	     }
	    catch(ArrayIndexOutOfBoundsException e)
	     {
	    	//handleTheExceptionSomehow(e);
	    	System.out.print("Index is out of bounds !!");
	      }
	}

}
