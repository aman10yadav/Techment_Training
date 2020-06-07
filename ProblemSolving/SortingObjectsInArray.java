package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;

class Product
{
	private int pid;
	float price;
	private String name;
	Product(int id , String name , float price)
	{
		this.pid=id;
		this.name = name;
		this.price = price;

	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public int getId()
	{
		return pid;
	}
	public float getPrice()
	{
		return price;
	}

}


public class SortingObjectsInArray {
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */      
		Scanner input = new Scanner(System.in);
		
		Product ob[] = new Product[5];

		/* Variable declaration */
		int pid;
		float price;
		String name;
		
		/* Taking input from the user */
		for(int i=0 ; i<5 ; i++) 
		{
			System.out.print("Enter the Product id " + (i+1) + " : " );
			pid = input.nextInt();
			System.out.print("Enter the Product name " + (i+1) + " : " );
			name = input.next();
			System.out.print("Enter the Product price" + (i+1) + " : " );
			price = input.nextFloat();
			ob[i]=new  Product(pid , name , price);
		}
		
		/* Sorting names */ 
		for (int i=0 ; i<5 ; i++) 
		{
			for (int j=i+1 ; j<5 ; j++) 
			{
				if (ob[i].getName().compareTo(ob[j].getName())>0) 
				{
					String temp = ob[i].getName();
					ob[i].setName(ob[j].getName());
					ob[j].setName(temp);
				}
			}
		}

		System.out.println("\n\nOutput : \n");
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println( ob[i].getId() + "\t" + ob[i].getName() + "\t\t\t" + ob[i].getPrice());
		}

	}
}