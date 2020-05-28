/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day2;

import java.util.Scanner;

/**
 *
 * @author AMAN10-PC
 */

public class DuplicateRemoving {
	
	public static int removeDuplicateElements(int array[], int size){  
       
		/* Checking for the size */
		if (size==0 || size==1)
		 {  
            return size;  
          }  
        
		int[] temp = new int[size];  
        int y = 0;  
        for (int x=0; x<size-1; x++){  
            if (array[x] != array[x+1]){  
                temp[y++] = array[y];  
            }  
         }  
        
        temp[y++] = array[size-1];   
        
        /* Changing original array */  
        for (int x=0; x<y; x++){  
            array[x] = temp[x];  
        }  
        return y;  
    }  
       
    public static void main (String[] args) {  
        
    	 /* declaring variable to take input */
    	Scanner input = new Scanner(System.in);
    	
    	 /* variable declaration */
    	int array[],size,i,j,temp;
    	
	    System.out.println("Enter the size of the array: ");
	    size = input.nextInt();
	    array = new int[size];
	      
	    /* Enter element of array */
	    System.out.println("Enter the elements of the array ::");
	    for(i=0; i<size; i++) 
	      {
	         array[i] = input.nextInt();
	       }
	      
	     System.out.print("Sorting Array......\n");
	       for(i=0; i<(size-1); i++)
	         {
	            for(j=0; j<(size-i-1); j++)
	             {
	                 if(array[j] > array[j+1])
	                  {
	                      temp = array[j];
	                      array[j] = array[j+1];
	                      array[j+1] = temp;
	                   }
	               }     
	           }
	       
	       
	       /* Elements after sorted*/
	      System.out.println("After sorting the array");
	       for(i=0; i<size;i++) 
	         {
	           System.out.print(" "+array[i]);
	          }
	      System.out.println("\n");
	       
	       /*Checking duplicacy of element by using function */
          size = removeDuplicateElements(array, size);   
          System.out.println("\n");
        
           /*printing non-duplicate array elements */  
          System.out.println("After removing duplicate element from the array");
          for (int k=0; k<size; k++)  
           {
        	  System.out.print(array[k]+" ");  
            }
      }
}
