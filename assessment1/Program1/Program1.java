package com.techment.assessment1;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=7,b;
		
		b = (a++ - ++a - a++ + ++a - a--) ; 
		System.out.println("The value of (a++ - ++a - a++ + ++a - a--) : "+b);
		System.out.print("\n");
		
		b = (--a + a-- + ++a + a-- - ++a);
		System.out.println("The value of (--a + a-- + ++a + a-- - ++a) : "+b);
	}

}
