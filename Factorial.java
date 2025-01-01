package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String ab[]){
		
		fact();
		
	}

	public static void fact(){
		int factorial = 0;
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();		
		for (int i = 1; i<=num; i++){
			factorial *= i;
		}
		System.out.println("Factorial of the given number is " +factorial);
	}
}
