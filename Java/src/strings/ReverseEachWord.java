package strings;

public class ReverseEachWord {

	public static String reverseEachWord(String str) {
		String ans = "";
		int currentWordStart = 0;
		int i = 0;
		for(; i<str.length(); i++) {
			
			if(str.charAt(i) == ' ') {
				
				// reverse the current word
				int currentWordEnd = i-1;
				String revWord = "";
				for(int j = currentWordEnd; j>=currentWordStart; j--) {
					revWord += str.charAt(j);
				}
				
				// Add it to the Final String
				ans  += revWord + " ";
				currentWordStart = i+1;    // update current word
			}
		}
		
		// for the case where no space encountered ->  last word
		int currentWordEnd = i-1;
		String revWord = "";
		for(int j = currentWordEnd; j>=currentWordStart; j--) {
			revWord += str.charAt(j);
		}
		ans  += revWord + " ";
		
		return ans;
	}
	
	public static void main(String[] args) {
		String str = "   tidum si taerg   ";
		String ans = reverseEachWord(str.trim());
		System.out.println(ans);
	}

}
