import java.util.*;

import java.lang.*;

public class pwdGen{

public static void main(String abhi[]){

System.out.println("Please enter first name");

Scanner scan = new Scanner(System.in);

String fName = scan.nextLine();

System.out.println("Enter Last Name");

String lName = scan.nextLine();

String fullName = fName.concat(lName);

System.out.println("Full Name is " + fullName);

String subName = fullName.substring(0,6);

long num = Math.round(Math.random()*1000);

String pwd = subName + num;

System.out.println("The Password is " +pwd);






}

}