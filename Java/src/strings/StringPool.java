package strings;

public class StringPool {

	public static void main(String[] args) {
		
		String str = "abc";
		String str1 = "abc";
	
		str1 = str1 + "def";
		
		str = "ghg";
		System.out.println(str1);
		System.out.println(str);
		

	}

}
