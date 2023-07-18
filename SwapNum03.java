public class SwapNum03{

public static void main(String ab[]){

int a =10, b = 20;

System.out.println("Number before swap " + a + " " + b);

b= a + b - (a = b);

System.out.print("The Number after swap " + a + " " + b);
}
}