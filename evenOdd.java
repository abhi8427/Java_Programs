package ternaryOperator;

import java.util.Scanner;

public class EvenOdd {
	
	public static void main(String ab[]){
		
		EvenOdd eo = new EvenOdd();
		eo.evenOdd();
		
	}



		public void evenOdd(){
			
			System.out.println("Please enter a number");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			
			String result = (num%2 == 0)?"Even Number":"Odd Number";
			System.out.println("The given number is "+ result);
			
		}

}