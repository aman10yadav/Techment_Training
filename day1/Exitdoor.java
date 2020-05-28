/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day1;


import java.util.Scanner;       /* Declaration of import libraries */

/**
 *
 * @author AMAN10-PC
 */
public class Exitdoor {
    
  public static void main(String args[])  {
    
    /* declaring variable to take input */
    Scanner input = new Scanner(System.in);     
   
   
    System.out.print("Enter the door number to find the exit door :- ");
    int digit = input.nextInt();     /*  Taking input from the user */
    int sum = 0;
    
     /* processing the code and adding each digit one by one  */
    while(digit!=0)
     {
        int remainder = digit%10;    
        sum = sum + remainder;
        digit = digit/10;
     }
    System.out.println("The exit door number of the glasshouse will be :- "+sum);
 }    
}