package strings;

public class PermutationTwoString2 {

	public static boolean CheckPermutation(String str1, String str2) {
		if(str1.length() !=str2.length()) {
			return false;
		}
		
		int arr[] = new int[256];

		for(int i = 0; i<str1.length(); i++) {
			arr[str1.charAt(i)]++;
		}
		
		
		for(int i = 0; i<str2.length(); i++) {
			arr[str2.charAt(i)]--;
		}
		
		
		for(int i = 0 ;i <arr.length; i++) {
			if(arr[i] != 0) {
				return false;
			}
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		String str1 = "abca";
		String str2 = "cbac";
		boolean ans = CheckPermutation(str1,str2);
		System.out.println(ans);
		
	}

}
