
public class RemoveSpace01{

public static void main(String ab[]){

String s1 = "A B H I S H E K";

System.out.println("Your string with spaces is " + s1);

String s2 = s1.replaceAll("\\s","");

System.out.println("Your string without spaces is " + s2);

}
}