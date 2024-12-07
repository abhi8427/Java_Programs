package sevenDecember;

import java.util.Scanner;

public class Average {
	
	public static void main(String ab[]){
		
		Average avg = new Average();
		avg.average();
		
	}
	
	public void average(){
		System.out.println("Please enter first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		System.out.println("Please enter third number");
		int num3 = scan.nextInt();
		
		int avg = (num1+num2+num3)/3;
		System.out.println("Average of 3 numbers is " + avg);
	}

}
