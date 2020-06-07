package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;
import java.util.Stack;

public class stackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);

		/* Variable declaration */
		int i,flag = 0;
		
		/* Stack implementation */
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println("Elements Pushed into Stack:- ");
		for(i=0; i<5; i++)
		{
			stack.push(input.nextInt());								/* Taking input from the user */
		}
	
		System.out.println("Elements Popped from Stack:- ");
		System.out.println("Item popped is :- "+stack.pop());
		System.out.println("Item popped is :- "+stack.pop());
		System.out.println("Item popped is :- "+stack.pop());
		System.out.println("Item popped is :- "+stack.pop());
		System.out.println("Item popped is :- "+stack.pop());	
	}
}