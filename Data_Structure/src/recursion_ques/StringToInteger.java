package recursion_ques;

public class StringToInteger {

	public static int conversion(String s) {
		// base case
		if(s.length() == 1) {
			return s.charAt(0) - '0' ;
		}
		
		
		int a = conversion(s.substring(1));
		int b = s.charAt(0) - '0';
		b = (int) (b*Math.pow(10,s.length()-1) + a);
		return b;
	}
	
	public static void main(String[] args) {
		String s = "12345";
		System.out.println(conversion(s));
	}

}
