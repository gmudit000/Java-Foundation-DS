package strings;

public class ReverseString {

	public static void reverseIt(String str) {
		String rev = "";
		for(int i = str.length()-1; i>=0;i--) {
			rev = rev + str.charAt(i);
		}
		
//	 Approach 2
//		for(int i = 0; i< str.length() ; i++) {
//			rev = str.charAt(i) + rev;
//		}
		
		System.out.println(rev);
	}
	
	public static void main(String[] args) {
		
		String str = "tidum si eman ym";
		reverseIt(str);
		
	}
}