public class numCount{

public static void main(String ab[]){

int num = 12345;

int count = 0;

while(num>0)
{
num = num/10;
count++;
}

System.out.println("The numbers in given digit is " +count);

}


}