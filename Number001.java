import java.util.*;

public class Number001{

public static void main(String abhi[]){

System.out.println("Please enter first number");

Scanner scan = new Scanner(System.in);

int num1 = scan.nextInt();

System.out.println("Please enter second number");

int num2 = scan.nextInt();

if(num1>num2){

System.out.println(num1 + " is greater than " + num2);
}else if(num2>num1)
{
System.out.println(num2 + " is greater than " + num1);
}else if(num1 == num2)
{
System.out.println(num1 + " and " + num2 + " are equal");
}


}
}