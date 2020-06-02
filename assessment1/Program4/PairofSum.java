package com.techment.assessment1;

import java.util.Scanner;

public class PairofSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int array[],size,i,j,sum,flag=0;
		
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
	      }
	    
	    System.out.println("Entered sum to find pair from the array : ");
	    sum = input.nextInt();
	    
	    for(i=0; i<size; i++) 
	     {
	       for(j=i+1; j<size; j++)
	        {
              if( ((array[i] + array[j])==sum) ) 
                {             
            	  System.out.println("Sum of Pair ("+array[j]+","+array[i]+")");
            	  flag = 1;
                 }
             }
	      }
        if(flag==0) {                           
                System.out.println("Pair of sum for "+sum+" is not present in the list.");
        }
	}
}