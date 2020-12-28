package strings;

public class StringvsStringBuffer {

	public static void main(String[] args) {
		
		// StringBuffer - mutable
		StringBuffer str = new StringBuffer("abc");

		str.setCharAt(1, 'c');
		str.append("def");
		System.out.println(str);
		
		// String - immutable
		String s = "d";
		for(int i = 0; i< 5; i++) {
			s = s + 'z';
		}
		System.out.println(s);
	}

}
