package strings;

public class RemoveConsecutivesDuplicates {

	public static String revConsecutivesDuplicates(String str) {
		String ans = "";
		ans += str.charAt(0);
		
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i) != ans.charAt(ans.length() - 1)) {
				ans += str.charAt(i);
			}
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "aaaaa";
		String ans = revConsecutivesDuplicates(str);
		System.out.println(ans);
	}

}
