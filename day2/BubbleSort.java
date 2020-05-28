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
public class BubbleSort {
    
    public static void main(String args[]) {
       
        /* declaring variable to take input */
       Scanner input = new Scanner(System.in);
        
       int size,i,j,temp,array[];                         /* variable declaration */
      
       System.out.print("Enter the size of array: ");
       size = input.nextInt();                            /* Taking input from the user*/
       array = new int[size];                             /* Initialising the size of array */
       
       /* Taking input from the user to enter element*/
       System.out.print("Enter "+size+" element: ");
       for(i=0; i<size; i++) 
         {
           array[i] = input.nextInt();
          }
       
        /* Sorting using bubble sort Technique*/
       System.out.print("Sorting Array using bubble sort Technique......\n");
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
       
        /* Elements are sorted*/
       System.out.print("After sorting the array");
       for(i=0; i<size;i++) 
         {
           System.out.print(" "+array[i]);
          }  
   }  
    
}
