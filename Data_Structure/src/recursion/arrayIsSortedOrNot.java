package recursion;

public class arrayIsSortedOrNot {

	public static boolean isSorted(int[] a) {
		
		// base case
		if(a.length == 1) {
			return true;
		}
		
		if(a[0] > a[1]) {
			return false;
		}
		
		// create a smaller array
		int[] smallArray = new int[a.length - 1];
		for(int i = 1; i<a.length ; i++) {
			smallArray[i-1] = a[i];
		}
		
		// recursion
		boolean isSmallArraySorted = isSorted(smallArray);
		return isSmallArraySorted;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,9,4,5};
		System.out.println(isSorted(arr));
	}

}
