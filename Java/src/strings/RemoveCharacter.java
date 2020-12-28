package strings;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String input, char c) {
	   String ans = "";
	   for(int i = 0; i<input.length(); i++) {
		   if(input.charAt(i) != c) {
			   ans += input.charAt(i);
		   }
	   }
        
		return ans;
	}

	public static void main(String[] args) {
		String str = "Think of edge cases before submitting solutions";
		char c = 'x';
		System.out.println(str);
		String ans = removeAllOccurrencesOfChar(str,c);
		System.out.println(ans);
	}

}
