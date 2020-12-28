package strings;

public class CompressTheString {
	
	public static String compress(String str) {
		String ans="" + str.charAt(0);
		int count = 1;
		for(int i = 1; i<str.length(); i++) {
			if(str.charAt(i)!=str.charAt(i-1)) {     // condition
				if(count>1) {
					ans += count;
				}
				ans += str.charAt(i);
				count= 1;
			}else {
				count++;
			}
		}
		
		// handling corner case when last few char are repeating and don't get change to check "condition"
		// eg- try str = "annncdddeeeeeeeee"
		if(count>1){
            ans+=count;
        }
		
		return ans;
		}
		
		

	public static void main(String[] args) {
		String str = "aaaccccbbsssaaaa";
		String ans = compress(str);
		System.out.println(ans);
	}
}