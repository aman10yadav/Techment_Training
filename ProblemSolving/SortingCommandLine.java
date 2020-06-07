package com.techment.assignment.sunday1;

/* Declaration of import libraries */
import java.util.*;

public class SortingCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Declaration for list and input stream  */
		List<String> nameList = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		int numberofnames;
		
		/* Taking input from the user */
		System.out.print("Enter the number of names you want to enter:- ");
		numberofnames = input.nextInt();
		
	
		System.out.println("Enter "+numberofnames+" names:- ");
		for (int i = 0; i <= numberofnames; i++) {
			/* Taking input from the user and adding in the lit */
			nameList.add(input.nextLine());
		}

		/* Providing unsorted list*/
		System.out.println("Unsorted name list is: ");
		for (String name : nameList) {
			System.out.print(" " + name);
		}
		System.out.print("\n");
		
		/* Sorting the list */
		Collections.sort(nameList);

		/* Printing the sorted list */
		System.out.println("Sorted name list is: ");
		for (String name : nameList) {
			System.out.print(" " + name);
		}
	
	}		
}