public class Student{

public static void main(String ab[]){

int rollNum = 1001;
String Name = "Abhishek";

Student st1 = new Student();

System.out.println(rollNum);

System.out.println(Name);

st1.read();
st1.doPractical();

}



public void read(){

System.out.println("Read the chapter");

}

public void doPractical(){

System.out.println("Do Practical");

}

}