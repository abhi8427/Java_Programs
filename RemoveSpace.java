public class RemoveSpace{

public static void main(String ab[]){

String str = "A b h i s h e k";

System.out.println("Before String :- " +str);

str = str.replaceAll("\\s", "");

System.out.println("After String :- " +str);


}
}