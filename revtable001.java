import java.util.*;


public class revtable001
{
public static void main(String ab[])
{
System.out.println("Enter any number");
Scanner scan = new Scanner(System.in);
int num = scan.nextInt();
System.out.println("Your reverse table is");

for(int i = 10;i>=1;i--)
System.out.println(num*i);

}
}