package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class Fibo {
	
	public static void main(String ab[]){
		
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		fiboGen(n);
		
	}
	
	
	public static void fiboGen(int n){
		int firstnum = 0;
		int secondnum = 1;
		
		for(int i=1;i<=n; i++){
			System.out.print(firstnum);
			System.out.print(" , ");
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
			
		}
	}

}
