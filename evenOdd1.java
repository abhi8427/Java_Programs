import java.util.*;

public class evenOdd1{

public static void main(String abhi[]){

System.out.println("Please enter any number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

if(num%2 == 0)
{
System.out.println("The number is even");
}
else
{
System.out.println("The Number is odd");
}

}
}