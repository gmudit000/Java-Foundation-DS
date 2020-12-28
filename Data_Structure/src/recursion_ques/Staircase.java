package recursion_ques;

public class Staircase {

	public static int staircase(int num) {
		if(num==0){
			return 1;
		}
		if(num<0){
			return 0;
		}
		return staircase(num-1)+staircase(num-2)+staircase(num-3);
		
	}
	
	public static void main(String[] args) {
		

	}

}
