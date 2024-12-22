package sevenDecember;

public class OddNum {
	
	public static void main(String ab[]){
		OddNum od = new OddNum();
		od.odd();
		
	}

	public void odd(){
		for(int num = 1; num<1000; num++){
			if(num%2 !=0){
				System.out.println(num);
			}
		}
	}
}
