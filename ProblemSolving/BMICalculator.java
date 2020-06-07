package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */               
import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
		
		/* Variable declaration */
		double weight,heightcm,heightm;
		
		System.out.print("Enter height(cm) :- ");
		heightcm = input.nextDouble();										/* Taking input from the user for height in centimeter*/
		
		System.out.print("Enter weight(kg) :- ");
		weight = input.nextDouble();										/* Taking input from the user for weight in kg*/
		
		heightm = heightcm/100;												/* Converting height from centimeter into meter  */
		
		double bmi = (weight/(heightm*heightm));							/* Calculating BMI */
		
		/* Checking condition for different BMI */
		if(bmi<18.5) 
		 {
			System.out.print("The patient is Underweight");
		  }
		else if( (bmi>18.5) && (bmi<25) ) 
		 {
			System.out.print("The patient is Normal");
		  }
		else if( (bmi>25) && (bmi<30) ) 
		 {
			System.out.print("The patient is Overweight");
		  }
		else 
		 {
			System.out.print("The patient is obese");
		  }
	}

}
