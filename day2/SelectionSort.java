/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day2;


/* Declaration of import libraries */
import java.util.Scanner;

/**
 *
 * @author AMAN10-PC
 */
public class SelectionSort {
    
    public static void main(String args[])  
   {  
       
       int size,array[],i, j, temp;                         /* variable declaration */
        
       Scanner input = new Scanner(System.in);              /* declaring variable to take input */
        
       System.out.print("Enter the size of the array : ");  
       size = input.nextInt();                              /* Taking input from the user*/
       array = new int[size];                               /* Initialising the size of array */
         
       /* Taking input from the user to enter element*/
       System.out.print("Enter "+size+" Elements : ");  
       for(i=0; i<size; i++)  
       {  
           array[i] = input.nextInt();  
       }  
         
       /* Sorting using selection sort Technique*/
       System.out.print("Sorting Array using Selection Sort Technique......\n");  
       for(i=0; i<size; i++)  
       {  
           for(j=i+1; j<size; j++)  
           {  
               if(array[i] > array[j])  
               {  
                   temp = array[i];  
                   array[i] = array[j];  
                   array[j] = temp;  
               }  
           }  
       }  
         
       /* Elements are sorted*/
       System.out.print("Now the Array after Sorting is :\n");  
       for(i=0; i<size; i++)  
       {  
           System.out.print(array[i]+ "  ");  
       }  
   }  
    
    
}
