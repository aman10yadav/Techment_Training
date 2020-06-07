package com.techment.assignment.sunday1;

/* Declaration of import libraries for inputting purposes */
import java.util.*;

class Question{
	
	private String question,option1,option2,option3,option4;
	private char correctanswer;
	Question(String question, String option1 , String option2 , String option3 , String option4 , char correctanswer)
	{
		this.question = question ;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.correctanswer = correctanswer;

	}
	public int question() {
		System.out.println(question);
		System.out.println("a. " + option1);
		System.out.println("b. " + option2);
		System.out.println("c. " + option3);
		System.out.println("d. " + option4);
		return 0;
	} 
	public String checkAnswer(char answer) {
		if(answer == correctanswer)
			return "You entered correct answer";
		else 
			return "You entered Wrong answer";
	}
}


public class QuizGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* declaring variable to take input */      
		Scanner s= new Scanner(System.in);
		
		Question ob1 = new Question("1. who is our national animal ?","Lion","Tiger","Peacock","Cow",'c');
		Question ob2 = new Question("2. what is the full form of CM ?","Channel Master","Cost Manager","Chart of Manager","Chief Minister",'d');
		Question ob3 = new Question("3. which of these is a capital of Madhya Pradesh  ?","Raipur","Bhopal","Ujjain","Indore",'b');
		Question ob4 = new Question("4. MongoDb is written in which language ? ","C++","Java","Javascript","Python",'a');

		
		/* Declaring HashMap */
		HashMap <String,Integer> Quiz = new HashMap <String,Integer>();

		//Asking for the number of question he want to ask
		System.out.print("Enter the number of Question which you want to ask [1-7] : ");
		int choice = s.nextInt();


		/* USing switch case  */
		switch(choice)
		{
		case 1 :
			Quiz.put("Question 1",ob1.question());
			System.out.print("Enter your answer choice : ");	
			char answer = s.next(). charAt(0);
			System.out.println(ob1.checkAnswer(answer));
			break;
		case 2:
			Quiz.put("Question 2",ob2.question());
			System.out.print("Enter your answer choice : ");	
			char answer1 = s.next(). charAt(0);
			System.out.println(ob2.checkAnswer(answer1));
			break;
		case 3:
			Quiz.put("Question 3",ob3.question());
			System.out.print("Enter your answer choice : ");	
			char answer3 = s.next(). charAt(0);
			System.out.println(ob3.checkAnswer(answer3));
			break;
		case 4:
			Quiz.put("Question 4",ob4.question());
			System.out.print("Enter your answer choice : ");	
			char answer4 = s.next(). charAt(0);
			System.out.println(ob3.checkAnswer(answer4));
			break;
		default:
			System.out.println("You entered a wrong Question. It should be in the range of 1 to 4....");
		}
	}
}
