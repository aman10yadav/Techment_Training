package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class PermutationofString {

	/* Function to print all the permutations of str */
    static void Permutation(String string, String answer) 
    { 
  
        /* If string is empty */  
        if (string.length() == 0) { 
            System.out.print(answer + " "); 
            return; 
        } 
  
        for (int i = 0; i < string.length(); i++) { 
  
            /* ith character of str */ 
            char ch = string.charAt(i); 
  
            /* Rest of the string after excluded */   
            String ros = string.substring(0, i) +  
                         string.substring(i + 1); 
  
            /* Recurvise call */  
           Permutation(ros, answer + ch); 
        } 
    } 
  
    
    public static void main(String[] args) 
    { 

    	/* declaring variable to take input */
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter a string:- ");
    	String string = input.nextLine();							/* Taking input from the user */
    	
    	/* Calling function */
    	System.out.println("The permutation of the string are:- ");
        Permutation(string, ""); 
    } 
}
