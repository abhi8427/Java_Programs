public class dupNum
{
public static void main(String abhi[])
{
int a[] = {1,2,3,1,4,1,1,5,1,2,3,4,1,2,1,2};

for (int i = 0; i<a.length;i++)
{
for(int j = i+1;j<a.length;j++)
{
if(a[i] == a[j])
System.out.println("Duplicate number is --- " +a[j]);
}


}
}
}