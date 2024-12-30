package sevenDecember;

import java.util.Scanner;

public class Table {
	
	public static void main(String ab[]){
		
		Table t = new Table();
		t.table();
		
	}
	
	
	public void table(){
		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("The multiplication table of given number is");		
		for (int i = 1; i<=10;i++){
			System.out.println(i*num);
		}
		
		
		
	}

}
