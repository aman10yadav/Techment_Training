package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);

		/* Variable declaration */
		String string1,string2;
		int sizestr1,sizestr2;
		
		System.out.println("Enter two string to check for anagram ");
		System.out.print("Enter first string : ");
		string1 = input.nextLine();										/* Taking input from the user */
		
		System.out.print("Enter second string : ");
		string2 = input.nextLine();										/* Taking input from the user */
		
		sizestr1 = string1.length();
		sizestr2 = string2.length();
		
		/* Converting String into characters */
		char[] str1 = string1.toCharArray();
		char[] str2 = string2.toCharArray();
		
		/* Sorting the first strings*/
		System.out.println("Sorted first string:- ");
		Arrays.parallelSort(str1);
		for (char i: str1) {
			System.out.print(i+" ");	
		}
		System.out.print("\n");
		
		
		/* Sorting the second string*/
		System.out.println("Sorted second string:- ");
		Arrays.parallelSort(str2);
		for (char i: str2) {
			System.out.print(i+" ");	
		}
		System.out.print("\n");
		
		/* Checking the equality of both the string */
	  if( Arrays.equals(str1, str2) )
		 {
			System.out.println("The entered both string is anagram ");
		  }
		else														/* Checking for inequality of string */
		 {
			System.out.println("Both the sting are not anagram !!");
	      }
	}

}
