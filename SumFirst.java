package sevenDecember;

import java.util.Scanner;

public class SumFirst {
	
	public static void main(String ab[]){
		
		SumFirst sf = new SumFirst();
		sf.firstSum();
		
	}

	public void firstSum(){
		
		
		System.out.println("Please enter the number");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		if(num<=0){
			System.out.println("Please enter a number greater then zero");
		}else{
			int sum = num*(num+1)/2;
			System.out.println("The sum of fist " + num + " numbers is " + sum);
		}
		
	}
}
