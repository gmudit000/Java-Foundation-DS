package recursionWithString;

public class RemoveDuplicates {

	public static String removeDuplicates(String s) {
		if(s.length() <=1) {
			return s;
		}
		
		if(s.charAt(0) == s.charAt(1)) {
			// call recursion on n-1 length
			String smallOutput = removeDuplicates(s.substring(1));
			return smallOutput;
		}else {
			// call recursion on n-1 length
			String smallOutput = removeDuplicates(s.substring(1));
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
		String ans = removeDuplicates("xxxyyyzwwzzz");
		System.out.println(ans);
	}

}
