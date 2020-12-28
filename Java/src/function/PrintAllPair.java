package function;

public class PrintAllPair {
	
	public static void PrintPair(int[] input, int n) {
		for(int i = 0; i<n-1;i++) {
			for(int j =i+1; j <n; j++) {
				System.out.println( "(" + input[i] + "," + input[j] + ")");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,7,6,5};
		int n = arr.length;
		PrintPair(arr, n);
	}
}