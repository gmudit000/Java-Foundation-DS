package strings;

public class PermutationTwoString {
	/*
	 * This code will fail when str1 will have duplicate elements
	 * Check PermutationTwoString2 file, frequency solution
	 */

	public static boolean CheckPermutation(String str1, String str2) {
		int count = 0;
		if(str1.length() != str2.length()) {
			return false;
		}
		
		for(int i = 0; i<str1.length(); i++) {
			for(int j =0; j<str2.length(); j++) {
				
				if(str1.charAt(i) == str2.charAt(j)) {
					count++;
					break;
				}
			}
		}
		
		if(count == str1.length()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = "cbd";
		boolean ans = CheckPermutation(str1,str2);
		System.out.println(ans);
	}

}
