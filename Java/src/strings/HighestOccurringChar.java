package strings;

public class HighestOccurringChar {
	
	public static char highestOccuringCharacter(String str) {
		int arr[] = new int[256];
		for(int i = 0; i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		
		// it will fail because we compare here acc. to arr sequence not str, try str = "yyxx"
//		int max = Integer.MIN_VALUE;
//		int maxIndex = 0;
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//				maxIndex = i;
//			}
//		}
//		return (char)maxIndex;
		
		char ans = str.charAt(0);
		int frequency = arr[ans];
		for(int i = 1; i<str.length(); i++) {
			if(arr[str.charAt(i)]>frequency) {
				ans = str.charAt(i);
				frequency = arr[str.charAt(i)];
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "yaa";
		char ans = highestOccuringCharacter(str);
		System.out.println(ans);
	}

}
