package arrays2d;

public class MoreOn2darrays {
	public static void main(String[] args) {
		
		// By default for non primitive type, default value is null
		
		int arr[][]=new int [4][];
		
		System.out.println(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(arr[0].length);
		
		//try these
//		int[][] arr2 = new int[][];
//		int[][] arr3 = new int[][2];
	    
	}

}
