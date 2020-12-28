package search_sort;

public class LinearSearch {

	public static int linear(int[] input, int x) {
		for(int i =0;i <input.length; i++) {
			if(x == input[i]) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {2,13,4,1,3,6,28};
		int x = 4;
		int output = linear(arr,x);
		System.out.println(output);
	}
}