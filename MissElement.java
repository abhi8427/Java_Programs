public class MissElement
{

public static void main (String abhi[])
{

int a[] = {1,3,4,5,6};

int sum1 = 0;
int sum2 = 0;
int misnum = 0;

for (int i=1; i<=5;i++)
sum1 = sum1+i;
System.out.println("Sum of first 5 numbers is = " + sum1);

for(int j=0;j<a.length;j++)
sum2 = sum2+a[j];
System.out.println("Sum of the array elements is = " +sum2);

misnum = sum1-sum2;
System.out.println("missing number is = "+misnum);



}
}