package strings;

public class Inbuild_functions {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		String str2 = "is fun";
		String str3 = "abcd";
		String str = new String("Coding");
		
		
//		// concatenation
//		System.out.println(str1 + str2);
//		System.out.println(str1.concat(str2));
//
//		//equals
//		System.out.println(str1.equals(str2));
//		System.out.println(str1.equals(str3));
//		////--------------- check difference
//		System.out.println(str1 == str3);
//		System.out.println(str1 == str);
//		
//		//contains
//		System.out.println(str1.contains("imm"));
		
		// compareTo 
		System.out.println(str1.compareTo(str3));
		
		
		// here the length of string is different
		String a ="abcd";
		String b ="abcda";
		System.out.println(a.compareTo(b));
		
		// Empty string and contains
		String str55="mcd";
		String str66="";
		
		System.out.println(str55.contains(str66));
		
	}

}
