
public class spaceRemove{

public static void main(String ab[]){

String str1 = "Hi I am ABhishek Kumar";

System.out.println("String before space remove - " + str1);
String str2 = str1.replaceAll("\\s","");

System.out.println("String after remove space - "+ str2);

}

}