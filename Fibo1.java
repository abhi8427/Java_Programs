package JANUARY2025.Java_Programs;

public class Fibo1 {
	
	public static void main(String ab[]){
		
		fiboPro();
		
	}
	
	public static void fiboPro(){
		int n1 = 0;
		int n2 = 1;
		int n3;
		int count = 10;
		int i;
		System.out.println(n1);
		for(i = 0; i<count;i++){
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
		
	}

}
