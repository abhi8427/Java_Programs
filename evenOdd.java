import java.util.*;

public class evenOdd{

public static void main(String abhi[]){

System.out.println("Please enter the number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

System.out.println("The entered number is " +num);

//int num = 4;

if(num%2==0){
System.out.println("Number is even");
}else
{
System.out.println("Number is odd");
}

}

}