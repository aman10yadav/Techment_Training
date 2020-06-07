package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Random;

public class CompareRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Declaring the random function*/
		Random randomnumber = new Random();

		/* Variable declaration */
		int randomnumber1,randomnumber2;

		/* Taking input from the user */
		randomnumber1 = randomnumber.nextInt();
		randomnumber2 = randomnumber.nextInt();
		
		System.out.println("The first random number is :- "+randomnumber1);
		System.out.println("The second random number is :- "+randomnumber2);
		
		/* Checking condition fo equallity*/
		if(randomnumber1 == randomnumber2)
		 {
			System.out.print("The random number are same");
		  }
		else													/* Checking fo non-equality condition */
		{
			System.out.print("The random number are not same");
		}
	}

}
