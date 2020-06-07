/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techment.assignment.day1;


/* Declaration of import libraries */
import java.util.Scanner;   

/**
 *
 * @author AMAN10-PC
 */
public class BestHorse {
    
  public static void main(String args[]) {
      
    /* declaring variable to take input */
    Scanner input = new Scanner(System.in);
    
    /* Taking input from the user*/
    System.out.println("Enter the weight of the three horse one by one below ");
    System.out.print("Enter the weight of the first horse : ");
    int horse1 = input.nextInt();
    System.out.print("Enter the weight of the second horse : ");
    int horse2 = input.nextInt();
    System.out.print("Enter the weight of the third horse : ");
    int horse3 = input.nextInt();
    
    /* Checking for existing of equal values between horses */
    if( (horse1==horse2) || (horse2==horse3) || (horse3==horse1) )
      {
        System.out.println("Entered weights are not distinct values");
       }
    else    /* Horses consisting of distinct values */
      {
        if( (horse1>horse2) && (horse2>horse3) )
          {
            System.out.println("The horse that should be taken by the king is the horse1 which is of weight "+horse1);
           }
        else if( (horse1>horse2) && (horse2<horse3) && (horse3>horse1) )
          {
            System.out.println("The horse that should be taken by the king is the horse3 which is of weight "+horse3);
           }
        else if( (horse1<horse2) && (horse2>horse3) )
          {
            System.out.println("The horse that should be taken by the king is the horse2 which is of weight "+horse2);
           }
        else if( (horse1<horse2) && (horse2<horse3) )
          {
            System.out.println("The horse that should be taken by the king is the horse3 which is of weight "+horse3);
           }
        else
          {
            System.out.println("Entered weights are not distinct values");
           }

       }
  }   
}
