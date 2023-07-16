import java.util.*;

public class PreNextNum{

public static void main(String ab[]){

System.out.println("Please enter any number");

Scanner scan = new Scanner(System.in);

int num = scan.nextInt();

int prenum = num-1;

int nxtnum = num+1;

System.out.println("You Have Entered number is " +num);

System.out.println("Previous Number is " + prenum);

System.out.println("Next Number is "+ nxtnum);


}
}