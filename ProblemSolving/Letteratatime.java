package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

public class Letteratatime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);

		/* Variable declaration */
		String message,messages="";
		char value,first,last;
		int size,count=0,occurence=0,i;
		
		System.out.print("Enter a message :- ");
		message = input.nextLine();									/* Taking input from the user */
		
		/* Calculating size of the message */
		size = message.length();
		
		/* Calculating number of characters */
		for(i=0; i<size; i++)
		 {
			value = message.charAt(i);
			if(value != ' ')	
			{
				count++;
			}
		 }
		System.out.print("The whole message consist of "+count+" characters.\n");
		
		/* Searching for first and last character */
		for(i=0; i<size; i++)
		 {
			value = message.charAt(i);
			if(i==0)
			{
				first = value;
				System.out.println("The first character of the message is '"+first+"' and the position of it is at index "+i);
			}
			if(i == size-1)
			{
				last = value;
				System.out.println("The last character of the message is '"+last+"' and the position of it is at index "+i);
			}
		  }
		
		/* Checking the occurrence of 'a' in message  */
		for(i=0; i<size; i++)
		 {
			value = message.charAt(i);
			if(value == 'a')
			{
				occurence++;
			}
			if(!messages.contains(String.valueOf(value)))
			{
				if(value!=' ')
				 {
				messages = messages + String.valueOf(value);
				  }
			}
		 }
		System.out.println("All the charactes that appears one at a time are:- "+messages);
		System.out.println("The amount of time that 'a' appears in the message is:- "+occurence);
	}
}
