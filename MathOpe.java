package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class MathOpe {
	
	public static void main(String ab[]){
		
		mathOp();
		
	}
	
	
	public static void mathOp(){
		System.out.println("Please enter first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		int sum = num1+num2;
		System.out.println("Sum of the two numbers is " + sum);
		
		int mul = num1*num2;
		System.out.println("Multiplication of two numbers is " + mul);
		
		
	}

}
