package sevenDecember;

import java.util.Scanner;

public class Swap1 {
	
	public static void main(String ab[]){
		
		Swap1 sw = new Swap1();
		sw.Temp();
		sw.NoTemp();
		
	}
	
	public void Temp(){
		int temp = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Number swap program with the help of third vairable");
		System.out.println("Please enter the first number ");
		int num1 = scan.nextInt();
		System.out.println("Please enter the second number ");
		int num2 = scan.nextInt();
		System.out.println("Two numbers before swap");
		System.out.println("First Number is :- " + num1);
		System.out.println("Second Number is :- " + num2);
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("************************************");
		System.out.println("Two numbers after swap");
		System.out.println("First number is :- " +num1);
		System.out.println("Second number is :- " +num2);
		//scan.close();
	}
	
	public void NoTemp(){
		System.out.println("Number swap program without third variable");
		System.out.println("Please enter the first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("Please enter the second number");
		int num2 = scan.nextInt();
		System.out.println("First number before swap :- " +num1);
		System.out.println("Second number before swap :- " +num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("First number after swap :- " +num1);
		System.out.println("Second Number after swap :- " +num2);
		
		
	}

}
