public class Animal01{

String color;
int age;


public static void main(String ab[]){


Animal01 cow = new Animal01();

cow.intObj("red", 25);
cow.display();

}
public void intObj(String c, int a){

color = c;
age = a;
}

public void display(){

System.out.print(color + " " + age);

}


}

