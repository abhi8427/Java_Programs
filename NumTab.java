import java.util.*;

public class NumTab{

public static void main(String ab[]){

System.out.println("Enter any Number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

System.out.println("Table is given below");

for(int i = 1; i<=10; i++)
System.out.println(num*i);

}

}
