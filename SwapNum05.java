public class SwapNum05{

public static void main (String ab[]){

int a = 50, b = 100;

System.out.println("Number before swap " + a + " " + b );

a = a+b;
b = a-b;
a = a-b;

System.out.println("Number after swap " + a + " " + b);



}
}