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
public class RotatingArray {
    
   public static void main(String[] args) {  
        
        /* declaring variable to take input */
       Scanner input = new Scanner(System.in);
         
       int size,array[];
         
       System.out.print("Enter the size of the element: ");
       size = input.nextInt();                            /* Taking input from the user*/
       array = new int[size];                             /* Initialising the size of array */
       
       /* Taking input from the user to enter element*/
       System.out.print("Enter "+size+" element: ");
       for(int i=0; i<size; i++) {
           array[i] = input.nextInt();
       }
    	   
        int size1 = (size/2);                          /*  Rotating from middle*/
       
        //Rotate the given array by middle times toward left  
        for(int i = 0; i < size1; i++){  
            int j, first;  
            //Stores the first element of the array 
            first = array[0];  
            for(j = 0; j < array.length-1; j++){  
                //Shift element of array by one  
                array[j] = array[j+1];  
            }  
            //First element of array will be added to the end  
            array[j] = first;  
        }  
        System.out.println(); 
        
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation..... ");  
        for(int i = 0; i< array.length; i++){  
            System.out.print(array[i] + " ");  
        }  
    }  
    
}
