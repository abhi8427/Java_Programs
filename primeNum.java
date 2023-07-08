import java.util.*;

public class primeNum{

public static void main(String ab[]){

System.out.println("Enter any number");

Scanner scan = new Scanner(System.in);
int num = scan.nextInt();

if(num == 0 || num == 1)
{
System.out.println("Number is not prime");
}else if(num == 2)
{
System.out.println("Number is prime");
}else if(num%2 == 0)
{
System.out.println("Number is not prime");
}else
{
System.out.println("Number is prime");
}

}


}