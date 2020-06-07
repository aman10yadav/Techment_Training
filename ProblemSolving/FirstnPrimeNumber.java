package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class FirstnPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int number,check;
		
		System.out.print("Enter a number upto which you want to get prime number :- ");
		number = input.nextInt();										/* Taking input from the user */

		/* Checking whether the number is prime or not */
		if (isPrime(number)) 
		 {  
	           System.out.println(number + " is a prime number");  
	       } 
		else
		 {  
	           System.out.println(number + " is not a prime number");  
	       }  
		
		/* Printing upto n prime numbers */
		System.out.println("Prime number upto "+number+" are:-  ");
		for(int i = 2 ; i <= number ; i++)
		{
			/*logic for checking number is prime or not */
			int count = 0;
			for(int j = 1 ; j <= i ; j++)	
			{
				if(i % j == 0)
					count = count+1;
			}
			if(count == 2)
				System.out.println(i);
		}
	}
	
	/* function for checking prime or not */
	 public static boolean isPrime(int number) {  
	       if (number <= 1) 
	        {  
	           return false;  
	         }  
	       for (int i = 2; i <number; i++)
	        {  
	           if (number % i == 0)
	            {  
	               return false;  
	             }  
	         }  
	       return true;  
	   }  
}
