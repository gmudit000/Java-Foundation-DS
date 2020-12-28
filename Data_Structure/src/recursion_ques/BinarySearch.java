package recursion_ques;

public class BinarySearch {

	public static int binarySearch(int[] a, int si, int ei, int x) {
		// base case
		if(si>ei) {
			return -1;
		}
		
		
		int mid = (si+ei)/2;
		if(x == a[mid]) {
			return mid;
		}else if(x <= a[mid]) {
			ei = mid - 1;
			return binarySearch(a, si, ei,x);
		}else {
			si = mid + 1;
			return binarySearch(a,si,ei,x);
		}
		
		
	}
	
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50,60,70};
		System.out.println(binarySearch(a, 0 , a.length-1, 100));	
	}

}
