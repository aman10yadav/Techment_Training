package com.techment.assignment.sunday1;

/* Declaration of import libraries */
import java.util.*;

class catalogue {
	
	private  int id , price ;
	private  String name;
	
	public void putId(int id)
	 {
		this.id=id;
	  }
	
	public void putPrice(int price)
	 {
		this.price=price;
	  }
	
	public void putName(String name)
	 {
		this.name = name;
	  }
	
	public int getId() 
	 {
		return id;
	  }
	
	public int getPrice()
	 {
		return price;
	  }
	
	public String getName() 
	 {
		return name;
	  }
}

public class ProductCatalogue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */
		Scanner s = new Scanner(System.in);

		/* Variable declaration */
		int id, price;
		String name;

		/* Declaring ArrayList*/
		ArrayList<catalogue> productObject = new ArrayList<catalogue>();
		System.out.print("Enter number of products to add to catalogue : ");
		int productnumber = s.nextInt();

		for(int i=1 ; i <= productnumber; i++) 
		{
			System.out.print("\n" + "Enter the id of product " + i + " : ");
			id = s.nextInt(); 												/* Taking input from the user */
			System.out.print(  "Enter the name of product " + i + " : ");
			name = s.next(); 												/* Taking input from the user */
			System.out.print( "Enter the price of product " + i + " : ");
			price = s.nextInt(); 											/* Taking input from the user */

			catalogue object = new catalogue();
			object.putId(id);
			object.putName(name);
			object.putPrice(price);
			
			/* Adding the object to the ArrayList */
			productObject.add(object);

		}
		int flag=0;
		
		System.out.print("Enter the id of product to find details : ");
		int searchId = s.nextInt();
		
		/* Checking for id match*/
		for(catalogue obj : productObject)
		{
			if(obj.getId() == searchId)
			{
				flag=1;
				System.out.println("Product found with id : " + obj.getId());
				System.out.println("Name : " + obj.getName());
				System.out.println("Price : " + obj.getPrice());
				break;
			}

		}	
		if(flag==0)						 /* if id didn't matches */
			System.out.println("Product not found !!");
	 }
 }	