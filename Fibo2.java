package JANUARY2025.Java_Programs;

import java.util.Scanner;

public class Fibo2 {
	
	public static void main (String args[]){
		
		fiboPro();
		
	}
	
	public static void fiboPro(){
		System.out.println("Please enter the count to generate Fibonicci Series ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		System.out.println(n1);
		for(int i = 0; i<count-1;i++){
			n3 = n2 + n1;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
