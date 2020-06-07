package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WhatsYourAge {

	 public static void main(String[] args) throws Exception {
		 
		 /* declaring variable to take input */
		   Scanner scanner = new Scanner(System.in);
		 
		   System.out.print("Please enter date of birth in YYYY-MM-DD: ");
		   String input = scanner.nextLine();
	      	 
		   SimpleDateFormat simpledateformat = new SimpleDateFormat("YYYY-MM-DD");
	       Calendar dob = Calendar.getInstance();
	       dob.setTime(simpledateformat.parse(input));
	       System.out.println("Age is:" + getAge(dob));
	    }
	 
	    /* Returns age by taking the date of birth */ 
	    public static int getAge(Calendar dob) throws Exception {
	        Calendar today = Calendar.getInstance();
	 
	        int curYear = today.get(Calendar.YEAR);
	        int dobYear = dob.get(Calendar.YEAR);
	 
	        int age = curYear - dobYear;
	        int month=0,days=0;
	     
	        /* if dob is month or day is behind today's month or day then reduce age by 1 */ 
	        int curMonth = today.get(Calendar.MONTH);
	        int dobMonth = dob.get(Calendar.MONTH);
	        
	        /* this year can't be counted! */ 
	        if (dobMonth > curMonth) 
	         { 
	            age--;
	          }
	        else if (dobMonth == curMonth) 						/* same month? check for day */
	         { 
	            int curDay = today.get(Calendar.DAY_OF_MONTH);
	            int dobDay = dob.get(Calendar.DAY_OF_MONTH);
	            if (dobDay > curDay)							/* / this year can't be counted! */ 
	             { 
	                age--;
	              }
	          }
	        return age;
	    }
}