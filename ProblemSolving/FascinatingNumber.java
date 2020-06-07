package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class FascinatingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		 /* Variable declaration */
		int digit;

		/* Taking input from the user */
		System.out.print("Please enter digit :- ");
		digit = input.nextInt();
		
		/* Checking fo invalid three digit number */
		if (digit < 100 || digit > 999)
		 {
            System.out.println(digit + " is not a valid 3 digit number!");
          } 
		else 							
		 {
            if (isFascinatingNumber(digit)) 
             {
                System.out.println(digit + " is a fascinating number!");
              } 
            else
             {
                System.out.println(digit + " is NOT a fascinating number!");
              }
        }
    }
 
    /*Checks whether the input number is a fascinating number */
    public static boolean isFascinatingNumber(int digit) {
        String concatenation = "" + digit + digit * 2 + digit * 3;
        int position,i;
        
        /* check existence of 1 to 9 exactly once! */
        for (i = 1; i <= 9; i++)
         {
            position = concatenation.indexOf(i + "");
            /* checking for digit is missing?  */
            if (position < 0)
             {
                return false;
              }
            else 
             {
                /* checking for duplicacy of digit */
                if (concatenation.substring(position+1).indexOf(i + "") >= 0) 
                 {
                    return false;
                  }
            }
         }
        System.out.println("After concating all threes number : "+concatenation);
        return true;
    }		
}