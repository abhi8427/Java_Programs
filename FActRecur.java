package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class FActRecur {
	
	public static void main(String ab[]){
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("The factorial of given number " + number + " is "+ factRecur(number));
		
	}
	
	
	public static int factRecur(int n){
		if(n == 0 || n == 1){
			return n;
		}
		return n*factRecur(n-1);
		
	}

}
