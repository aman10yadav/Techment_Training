package com.techment.assignment.sunday1;

/* Declaration of import libraries */
import java.io.*;
import java.util.Arrays;

public class SortWordsofSentences {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/* Taking bufferreader to take input  */
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in)); 
		
		System.out.println("Enter a sentence to sort each words :- ");
		
		/* for taking a string as an input */
		String sentence = inp.readLine(); 
		
		/* splits the string based on whitespace */
		String[] words=sentence.split("\\s");  
	
		Arrays.sort(words);
		
		/* using java foreach loop to print elements of string array */  
		for(String w:words)
		 {  
			System.out.println(w);  
		  }  
	}
}
