package arrays2d;

public class how2darraystore {

	public static void main(String[] args) {
		int[][] arr = {{4,1,2,4}, {100,5,3,6}, {1,2,3,2,9} };
		// 2D is basically arrays of arrays
		
		//reference of master array 
		System.out.println(arr);
		
		//references of 1-D arrays  
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		
		// no of rows
		System.out.println(arr.length);
		
		// no of cols
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		// data
		System.out.println(arr[0][2]);

	}

}