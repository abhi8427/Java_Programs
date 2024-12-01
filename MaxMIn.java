package ternaryOperator;

import java.util.Scanner;

public class MaxMIn {
	
	public static void main(String ab[]){
		
		MaxMIn mn = new MaxMIn();
		mn.maxMin();
		
	}
	
	public void maxMin(){
		System.out.println("Please enter a first number");
		Scanner scan = new Scanner (System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		String result = (num1>num2)?"First Number is greater":"Second number is greater";
		System.out.println(result);
		
	}

}
