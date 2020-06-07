package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Random;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Declaring the random function*/
		Random randomnumber = new Random();

		/* Variable declaration */
		int randomnumber1,randomnumber2;
		
		randomnumber1 = randomnumber.nextInt(7);
		randomnumber2 = randomnumber.nextInt(7);
		
		/* Checking Condition */
		while(randomnumber1<1 || randomnumber2<1 )
		 {
		if(randomnumber1<1) 
		 {
			randomnumber1 = randomnumber.nextInt(7);
		  }
		else if(randomnumber1<1)
		 {
			randomnumber2 = randomnumber.nextInt(7);
		  }
		else
		 {
			break;
		  }
		 }
		
		System.out.println("The first random number is :- "+randomnumber1);
		System.out.println("The second random number is :- "+randomnumber2);
		
		/* Checking for the even terms */
		if( (randomnumber1%2==0) && (randomnumber2%2==0) )
		 {
			System.out.println("Both the number are even:-\n"); 
			System.out.print("So,the sum of the number is:- "+(randomnumber1+randomnumber2));
		  }
		else														/* Checking for uneven number */
		{
			if(randomnumber1>randomnumber2)
			 {
				System.out.println("Both the number are not even:-\n");
				System.out.print("So,the subtraction of the number is:- "+(randomnumber1-randomnumber2));
			  }
			else
			 {
				System.out.println("Both the number are not even:-\n");
				System.out.print("So,the subtraction of the number is:- "+(randomnumber2-randomnumber1));
			  }
		}

	}

}
