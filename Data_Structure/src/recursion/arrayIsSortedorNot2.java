package recursion;

public class arrayIsSortedorNot2 {

	public static boolean isSortedBetter(int[] a, int si) {
		if(si == a.length - 1) {
			return true;
		}
		if(a[si] > a[si + 1]) {
			return false;
		}
		boolean isUpdatedSiSorted = isSortedBetter(a, si+1);
		return isUpdatedSiSorted;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,4,10,5,6,7};
		System.out.println(isSortedBetter(arr,0));
	}

}
