package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class SumofNum {
	
	public static void main(String ab[]){
		
		sum();


	}
	
	public static void sum(){
		System.out.println("Please enter first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		int sum = num1+num2;
		
		System.out.println("The sum of two numbers is " + sum);
	}
	
	

}
