import java.util.*;

public class Table1{

public static void main(String ab[]){

System.out.println("Please enter any number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

System.out.println("Your Table starts from here");

for(int i = 1;i<=10;i++)

System.out.println(num*i);


}

}