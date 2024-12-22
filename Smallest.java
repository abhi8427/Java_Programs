package sevenDecember;

import java.util.Scanner;

public class Smallest {
	
	public static void main(String ab[]){
		
		Smallest sm = new Smallest();
		sm.small();
		
	}
	
	public void small(){
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter the first number");
		int num1 = scan.nextInt();
		System.out.println("Please enter the second number");
		int num2 = scan.nextInt();
		System.out.println("Please enter the third number");
		int num3 = scan.nextInt();
		
		if(num1<num2 & num1<num3){
			System.out.println("Smallest number is :- " +num1);
		}else if(num2<num1 & num2<num3){
			System.out.println("Smallest number is :- " +num2);
		}else{
			System.out.println("Smallest number is :- "+num3);
		}
	}

}
