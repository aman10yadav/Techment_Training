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
public class BinarySearch {
    
    public static void main(String args[]) {
       
        /* declaring variable to take input */
       Scanner input = new Scanner(System.in);
       
       /* variable declaration */
       int size,array[],search,first,last,middle;                              
       
       System.out.print("Enter the size of the element: ");
       size = input.nextInt();                                  /* Taking input from the user*/
       array = new int[size];                                   /* Initialising the size of array */
       
       /* Taking input from the user to enter element*/
       System.out.print("Enter "+size+" element: ");
       for(int i=0; i<size; i++) {
           array[i] = input.nextInt();
       }
       
       /* Taking input from the user to search a number*/
       System.out.print("Enter the element to search: ");
       search = input.nextInt();
       
        /* Searching using binary search Technique*/
       System.out.print("Searching Array using binary search Technique......\n");
       first = 0;
       last = size-1;
       middle = (first+last)/2;
       while(first <= last) {
           if(array[middle] < search)        /* Checking if the element is before the middle*/
             {   
               System.out.println(search+" is at index "+middle);
               break;
              }
           else if(array[middle] == search)  /* Checking if the element is at the middle*/
             {
               first = middle + 1;
              }
           else                              /* The element could be after the middle*/
             {
               last = middle - 1;
              }
           middle = (first+last)/2;
       }
       if(first > last) {                    /* Searched element is not present*/
           System.out.println(search + "is not present.");
       }      
  }   
}