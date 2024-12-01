package ternaryOperator;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String ab[]){
		
		LeapYear lp = new LeapYear();
		lp.leapYear();
		
	}
	
	public void leapYear(){
		
		System.out.println("Enter a year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		String result = ((year % 4 == 0)&&(year % 100 != 0 || year % 400 == 0)?"Leap Year":"Not a Leap Year");
		System.out.println(result);
	}

}
