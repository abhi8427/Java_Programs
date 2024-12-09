package sevenDecember;

import java.util.Scanner;

public class BigNum {
	
	public static void main(String abrgs[]){
		
		BigNum bn = new BigNum();
		bn.bigNum();
		
	}

	public void bigNum(){
		System.out.println("Please enter first number");
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		
		System.out.println("Please enter second number");
		int num2 = scan.nextInt();
		
		System.out.println("Please enter third number");
		int num3 = scan.nextInt();
		
		if(num1>num2 && num1>num3){
			System.out.println(num1 + " is the largest number");
		}else if(num2>num3 && num2>num1){
			System.out.println(num2 + " is the largest number");
		}else{
			System.out.println(num3 + " Is the largest number");
		}
	}
}
