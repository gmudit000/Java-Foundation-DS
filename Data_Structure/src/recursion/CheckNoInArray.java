package recursion;

public class CheckNoInArray {

	public static boolean check(int[] a, int si, int x) {
		if(si == a.length) {
			return false;
		}
		if(a[si] == x) {
			return true;
		}
		return check(a,si+1,x);
	}
	
	public static void main(String[] args) {
		int arr[] = {9,8,10,15};
		System.out.println(check(arr,0,11));

	}

}
