package arrays2d;

public class declaration {

	public static void main(String[] args) {
		int[][] arr2d = new int[3][4];
		arr2d[1][2] = 4;
		System.out.println(arr2d[1][2]);
		
		// error will come, check indices
//		System.out.println(arr2d[2][4]);
		
		char[][] arrc = new char[3][2];
		arrc[1][1] = 's';
		System.out.println(arrc[1][1]);
		
		int arr[][]=new int[4][5];
	    for(int i=0;i<5;i++)
	    {
	        arr[0][i]=2;
	    }
	    System.out.print(arr[3][0]);

	}

}
