package test2_arrays;

public class MinimumWordLength {
	
	public static String minword(String str) {
		String ans = "";
		String replacedString = "";
		int high = Integer.MAX_VALUE;
		int startposition = 0;
		int i = 0;
		for(; i<str.length() ; i++) {
			if(str.charAt(i) == ' ') {
				int endposition= i-1;
				String word = "";
				for(int j = startposition; j<=endposition ; j++) {
					word += str.charAt(j);
				}
				if(word.length()<high) {
					high = word.length();
					ans = word;
					//replacedString = ans.replace(ans,word);
				}
				startposition = i+1;
			}
			
		}
		
		int endposition= i-1;
		String word = "";
		for(int j = startposition; j<=endposition ; j++) {
			word += str.charAt(j);
		}
		if(word.length()<high) {
			high = word.length();
			ans = word;
			//replacedString = ans.replace(ans,word);
		}
		
		//return replacedString;
		return ans;
	}

	public static void main(String[] args) {
		String str = "abc de ghihjk a uvw h j";
		String ans = minword(str);
		System.out.println(ans);
	}

}
