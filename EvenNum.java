package sevenDecember;

public class EvenNum {
	
	public static void main(String ab[]){
		
		EvenNum en = new EvenNum();
		en.even();
		
	}
	
	public void even(){
		for(int num = 1;num<100;num++){
			if(num%2 == 0){
				System.out.println(num);
			}
		}
	}

}
