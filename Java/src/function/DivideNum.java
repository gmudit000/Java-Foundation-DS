package function;

public class DivideNum {

	public static int divNum(int num, int deno) {
		// if deno is zero
		if(deno == 0) {
			return Integer.MIN_VALUE;
		}
		//System.out.println("Inside divide");
		return num/deno;
	}
	
	public static void printDivNum(int num, int deno) {
		if(deno == 0) {
			return;
		}
		System.out.println(num/deno);
	}
	
	public static void main(String[] args) {
		// function1 return int
		int ans = divNum(10,3);
		System.out.println(ans);
		
		// function2 return void/ nothing - printAns only
		printDivNum(10,6);
	}

}
