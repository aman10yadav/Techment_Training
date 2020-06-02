package com.techment.assessment1;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("The pattern is as given below : ");
		for(int i=1; i<6; i++)
		{
			for(int j=1; j<6; j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
	}

}
