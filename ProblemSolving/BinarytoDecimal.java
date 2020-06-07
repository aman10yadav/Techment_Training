package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);

		/* Variable declaration */
		int binarydigit,remainder,temp,sum=0,flag=0;

		/* Taking input from the user */
		System.out.print("Enter a binary digit:- ");
		binarydigit = input.nextInt();
		temp = binarydigit;
		
		/* Checkinf for each binary digit */
		while(binarydigit != 0 )
		 {
			remainder = binarydigit%10;
			int pow = (int) Math.pow(2, flag);
			int digit = remainder * pow ;
			flag = (flag + 1) ;
			sum = sum + digit;
			binarydigit = binarydigit/10;
	 	  }
		System.out.print("The decimal of "+temp+" is = "+sum);
	}

}
