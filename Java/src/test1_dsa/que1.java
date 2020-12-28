package test1_dsa;

public class que1 {
	
	public static boolean checkts(String s, String t) {
		if(t.length() == 0) {
			return true;
		}
		
		if(t.charAt(0) == s.charAt(0)) {
			return checkts(s.substring(1),t.substring(1));
		}else {
			return checkts(s.substring(1),t.substring(0));
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(checkts("mgdatrgui", "gargv"));
	}

}
