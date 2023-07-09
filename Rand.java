import java.util.*;

public class Rand{

public static void main(String abhi[]){

System.out.println("Enter any Number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

double num1 = num*Math.random()*1000;

System.out.println(num1);


}


}