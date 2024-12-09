package sevenDecember;

import java.util.Scanner;

public class Remainder {
	
	public static void main(String args[]){
		Remainder re = new Remainder();
		re.remain();
		
	}
	
	public void remain(){
		System.out.println("Please enter a dividend");
		Scanner scan = new Scanner(System.in);
		int dividend = scan.nextInt();
		System.out.println("Please enter a divisor");
		int divisor = scan.nextInt();
		
		if(dividend>divisor){
			int remainder = dividend%divisor;
			System.out.println("The remainder is "+remainder);
		}else{
			System.out.println("Dividend must be greater than divisor");
		}
	}

}
