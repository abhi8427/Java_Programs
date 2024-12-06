package Dec05122024;

import java.util.Scanner;

public class PassGen {
	
	public static void main(String ab[]){
		
		PassGen pg = new PassGen();
		pg.passgen();
		
	}
	
	public void passgen(){
	System.out.println("Please enter your name");
	Scanner scan = new Scanner(System.in);
	String name = scan.nextLine();
	
	String subName = name.substring(0, 4);
	int num = (int) (Math.random()*10000);
	
	String password = subName+num;
	System.out.println("Your Password is " + password);
	}

}
