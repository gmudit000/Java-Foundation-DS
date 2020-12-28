package recursionWithString;

public class ReplaceOrgWithSome {

	public static String replaceChar(String s,char a, char b) {
		// base case
		if(s.length() == 0) {
			return s;
		}
		
		// IH
		String smallOutput = replaceChar(s.substring(1), a, b);
		
		// IS
		if(s.charAt(0) == a) {
			return b + smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(replaceChar("abxcxdx" , 'x' , 'y'));
	}

}
