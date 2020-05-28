/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day1;


import java.util.Scanner;        /* Declaration of import libraries */

/**
 *
 * @author AMAN10-PC
 */
public class Carpermitted {
    
  public static void main(String args[])   {
      
    /* declaring variable to take input */
    Scanner sc = new Scanner(System.in);

     
    System.out.print("Enter current date:- ");
    int date = sc.nextInt();        /* declaring variable to take input */            
    
    if( (date<1) || (date>31) )         //Checking for invalid date
      {
        System.out.println("Invalid Input");
       }
    else                               //Checking for valid date
      {
        /* checking for even date */
        if( (date%2) == 0)             
          {
            System.out.println("Cars with Even registration numbers are permitted today ");
           }
        /* checking for odd date */
        else    
          {
            System.out.println("Cars with Odd registration numbers are permitted today");
           }
       }
  }
}