package recursion;

public class SumOfArray2 {

	
	public static int array2(int[] a, int n) {
		if(n == 0) {
			return 0 ;
		}
		
		return array2(a,n-1) + a[n-1];
	}
	
	public static void main(String[] args) {
		int[] arr = {2,3,4,5,6};
		int sum = array2(arr,arr.length);
		System.out.println(sum);

	}

}
