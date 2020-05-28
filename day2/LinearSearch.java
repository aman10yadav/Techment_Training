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
public class LinearSearch {
    
      public static void main(String args[]){
        
        /* declaring variable to take input */
        Scanner input = new Scanner(System.in);   
       
        int size,search,array[],i;                           /* variable declaration */
          
        
        System.out.print("Enter the size of elements you want to entered in an array :- ");
        size = input.nextInt();                          /* Taking input from the user*/
        array = new int[size];                           /* Initialising the size of array */
        
         /* Taking input from the user to enter element*/
        System.out.print("Enter "+size+" Elements : ");  
        for(i=0; i<size; i++) {
            array[i] = input.nextInt();
        }
        
         /* Taking input from the user to search a number*/
        System.out.print("Enter an element to find :-");
        search = input.nextInt();
        
         /* Searching using linear search Technique*/
        System.out.print("Searching Array using linear search Technique......\n");
        for(i=0; i<size; i++) {
            if(array[i]==search) {              /* Checking the presence of entered element */
                System.out.println(search+" is present at index "+i);
                break;
            }
        }
        
        if(i==size) {                           /* Entered element is not found */
                System.out.println(search+" is not present in the list.");
        }
  } 
}