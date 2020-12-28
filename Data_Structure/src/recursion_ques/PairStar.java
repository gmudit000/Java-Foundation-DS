package recursion_ques;

public class PairStar {

	public static String modified(String s) {
		if(s.length() == 1) {
			return s;
		}
		
		String smallAns = modified(s.substring(1));
		if(s.charAt(0) == s.charAt(1)) {
			return s.charAt(0) + "*" + smallAns;
		}else {
			return s.charAt(0) + smallAns;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(modified("muddit"));
		String a = "";
		System.out.println(a.length());
	}

}
