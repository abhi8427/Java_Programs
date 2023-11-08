import java.util.*;

public class table001{

public static void main(String ab[])
{

System.out.println("Enter any number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

System.out.println("your table is given below");

for(int i=1;i<=10; i++)

System.out.println(num*i);

}
}