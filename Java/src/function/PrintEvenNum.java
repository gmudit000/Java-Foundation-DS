package function;

public class PrintEvenNum {
	// please read it also,,, read carefully here we do not return anything
//	public static void printEvenNum() {
//		for(int i = 2; i<=100; i=i+2) {
//			System.out.print(i + " ");
//		}
//	}
	
	public static void printEvenNum2(int start, int end) {
		if(start%2 != 0) {		// check start is even or not
			start++;			// if not, then increment it 
		}
	
		for(int i = start; i<=end; i=i+2) {
			System.out.print(i + " ");
		}
	}
	
	
	public static void main(String[] args) {
		//printEvenNum();
		printEvenNum2(11, 50);
	}
}