package sevenDecember;

import java.util.Scanner;

public class Name {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Name name = new Name();
		name.name();

	}
	
	public void name(){
		System.out.println("Please enter your name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Hi " + name + " how are you?");
	}

}
