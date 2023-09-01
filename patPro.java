import java.util.*;

public class patPro{

public static void main(String ab[]){

System.out.println("Please enter number of rows");

Scanner scan = new Scanner(System.in);

int rownum = scan.nextInt();

for(int row = 1; row<=rownum; row++)
{
	for(int col = 1; col<=row;col++)
{

System.out.print("*");

}

System.out.println();
}


}

}