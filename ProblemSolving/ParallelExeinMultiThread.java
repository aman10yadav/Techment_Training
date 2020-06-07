package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.Scanner;
/* Taking input from the user */
/* Variable declaration */
/* declaring variable to take input */
/* Declaration of import libraries for Timer purposes */
import java.util.Timer;
import java.util.TimerTask;

/* Class extending thead */
class ChildThread extends Thread {
	int asterisk;

	ChildThread(int asterisk)
	 {
		super();
		this.asterisk=asterisk;
	  }

	public void run()
	 {
		for(int i=0; i<asterisk; i++)
		 {
			System.out.println("*");
			try
			 {
				Thread.sleep(1000);
			 }
			catch(InterruptedException e)
			 {
				System.out.println(e);
			  }
		  }
	  }
}

public class ParallelExeinMultiThread {

	public static void main(String[] args) {

		/* declaring variable to take input */
		Scanner input = new Scanner(System.in);
			
		int asterisk,dollar,i;
		
		System.out.println("Enter the number of time you want to print '*' : ");
		asterisk = input.nextInt();											/* Taking input from the user */

		System.out.println("Enter the number of time you want to print '$' : ");
		dollar = input.nextInt();										/* Taking input from the user */

		/* Creating thread object */
		ChildThread obj = new ChildThread(asterisk); 
		obj.start();
		
		for(i=0; i<dollar; i++)
		 {
			System.out.println("$");
			try
			 {
				Thread.sleep(500); 
			  }
			catch(InterruptedException e)
			 {
				System.out.println(e);
			  }
		  }
	}
}