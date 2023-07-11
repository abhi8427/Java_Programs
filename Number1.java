import java.util.*;

public class Number1{

public static void main(String abhi[]){

System.out.println("Please enter any number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

int prenum = num-1;

System.out.println("The previous number is " + prenum);

int nextnum = num+1;

System.out.println("The next number is " + nextnum);


}


}