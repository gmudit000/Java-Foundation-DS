package arrays2d;

public class JaggedArray {

	public static void main(String[] args) {
		
		int[][] arr = new int[4][];
		
//		arr[0] = new int[3];
//		System.out.println(arr[0][1]);
		
		// Play with array
//		for(int i = 0; i<arr.length;i++) {
//			arr[i] = new int[5];
//		}																		
//		for(int i = 0 ; i<arr.length; i++) {
//			for(int j = 0; j<arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		// jagged array
		for(int i = 0 ; i<arr.length ; i++) {
			arr[i] = new int[i+2];
		}
		
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}
