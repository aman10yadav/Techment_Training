package com.techment.assignment.day2;

import java.util.Scanner;

public class MergeSort {
	
	 /* Fuction to perform merge sort  */
	 public static void merge(int array[],int first,int middle,int last)
	  {  
		 /* Variable declaration  */  
	    int array2[],i, j;
	    int start = first;
	    int end = last+1;
	       
	     /* intialising size of array  */
	    array2 = new int[end];
	 
		for(i = first,j = middle+1; i<=middle && j<=last; start++)   /* Checking condition within the array */
	       {
	                  if(array[i] <= array[j])						 /* Checking element does not exceed size */
	                   {
	                	  array2[start] = array[i++];
	                    }
	                  else
	                   {
	                	  array2[start] = array[j++];
	                    }
	      	 }
		 while(i <= middle )    
	                 array2[start++] = array[i++];
	 
	               while(j<=last)   
	                 array2[start++] = array[j++];
	          
	   	 for(i = first ; i <= last; i++)
	                        array[i] = array2[i];					
	   } 
	  
	 
	     /* Function to sort element  */
	   public static void Sort(int array[],int first,int last)
	   {  
	     if(first<last)									/* Checking whether first element reach to the last element */
	        {
	           int middle = (first + last)/2;			/* Finding middle of array */
	           Sort(array,first,middle);				/* Sorting of left elements */
	           Sort(array,middle+1,last);				/* Sorting right elements */
	           merge(array,first,middle,last);
	 
	         }    
	   }  
	 
	 public static void printarray(int a[])
	{
	       for(int i=0; i < a.length; i++)
	        {
	        
	        System.out.print(a[i]+"  ");
	        }
	       
	}
	    public static void main(String[] args) 
	    {
	    	 /* declaring variable to take input */
	    	Scanner input = new Scanner(System.in);
	    	
	        int size,array[],res,i;							/* variable declaration */
	        
	        /* Taking input from the user for size  */
	        System.out.print("Enter number of elements in the array:");
	        size = input.nextInt();
	        array = new int[size];
	        
	         /* Taking declared size of array input */
	        System.out.println("Enter "+size+" elements ");
	        for( i=0; i < size; i++)
	        {
	            array[i] = input.nextInt();
	        }
	 
	         /* Checking value for the entered element  */
	        System.out.println( "elements in array ");
	        printarray(array);								/* function to read the provided elements of array */
	        Sort(array,0,size-1);							/* function to sort array */
	        System.out.print("\n\n");
	        
	        /* Sorting the entered values */
	        System.out.print("Sorting using Merge sort technique.........\n\n ");
	        System.out.println("Elements after sorting");	
	         printarray(array);								/* function to read the sorted element */
	       
	  }
}
