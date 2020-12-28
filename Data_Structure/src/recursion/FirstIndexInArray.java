package recursion;

public class FirstIndexInArray {

	public static int check(int[] a, int si, int x) {
		if(si == a.length) {
			return -1;
		}
		if(a[si] == x) {
			return si;
		}
		return check(a,si+1,x);
	}
	
	public static void main(String[] args) {
		int arr[] = {9,8,10,15,10};
		System.out.println(check(arr,0,10));

	}

}
