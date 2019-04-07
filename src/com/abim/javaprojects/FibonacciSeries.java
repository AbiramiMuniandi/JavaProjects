package com.abim.javaprojects;

import java.util.ArrayList;

public class FibonacciSeries {

	public static void main(String[] args) {
		int limit = 100;

		int f1 = 0, f2 = 1, f3;
		f3 = f1 + f2;

		ArrayList<Integer> fibonacciSeries = new ArrayList<Integer>();
		fibonacciSeries.add(f1);
		fibonacciSeries.add(f2);
		while(f3 < limit) {
			fibonacciSeries.add(f3);
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}

		System.out.println(fibonacciSeries);

		int totalNumbers = 10;

		int f01 = 1, f02 = 1, f03;
		System.out.println(f01);
		System.out.println(f02);
		for(int i = 2; i < totalNumbers; i ++) {
			f03 = f01 + f02;
			System.out.println(f03);
			f01 = f02;	
			f02 = f03;
		}

		System.out.println("fibonacci in recursion");
		printFibonacciSeries(totalNumbers);
		
	}
	
	static int n1 = 0;
	static int n2 = 1;
	public static void printFibonacciSeries(int totalNumbers){ 
		
		int n3;
	    if(totalNumbers > 0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         System.out.print(" "+n3);   
	         totalNumbers--;
	         printFibonacciSeries(totalNumbers);    
	     }    
	 } 

}
