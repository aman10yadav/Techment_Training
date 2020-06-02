package com.techment.assessment1;

import java.util.Scanner;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int array[],size,even=0,odd=0,i,j;
		
		System.out.print("Enter size of  the array : ");
	    size = input.nextInt();  					
	    array = new int[size]; 
	    
	    for(i=0; i<size; i++) 
	     {
	    	array[i] = input.nextInt();
	      }
	    
	    System.out.println("Entered array is : ");
	    for(i=0; i<size; i++)
	     {
	    	 System.out.print(array[i]+" ");
	    	 if((array[i]%2) == 0)
	    	  {
	    		 even = even + array[i];
	    	   }
	    	 else
	    	  {
	    		 odd = odd + array[i];
	    	   }
	      }
	    System.out.println("\n");
	    System.out.println("Adding even number,we get : "+even);
	    System.out.println("Adding odd number,we get : "+odd);
	}

}
