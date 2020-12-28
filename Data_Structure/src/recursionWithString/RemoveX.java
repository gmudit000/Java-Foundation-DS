package recursionWithString;

public class RemoveX {

	public static String removeX(String s) {
		// base case
		if(s.length() == 0) {
			return s;
		}
		
		// IH
		String smallOutput = removeX(s.substring(1));
		
		// IS
		if(s.charAt(0) == 'x') {
			return smallOutput;
		}else {
			return s.charAt(0) + smallOutput;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(removeX("abxcxdx"));
	}

}
