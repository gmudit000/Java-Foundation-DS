package fundamentals;

public class TypeConversiona {

	public static void main(String[] args) {
		 
		// question: both integer and float has equal size then what to pick??
		short p = 4;
		int c = p;
		p = (short)c;
		
		char ch = 'a';
		int i = ch;
		ch = (char)i;
		ch = (char)(ch + 1);
		System.out.println(i);
		System.out.println(ch);
		
		// by default decimal value is double - thats why 1.7f 0r (float)1.7
		float f = 1.7f;
		
		// bigger datatype is picked
		System.out.println(4+4);
		System.out.println(4+4.0);
		System.out.println(4.5+4.5);
		System.out.println(2/(double)5);
		//or System.out.println(2.0/5);
		
		System.out.println('a' + 1);
		
		int ip = 'c';
		char cp = (char)ip;
		System.out.println(ip);
		System.out.println(cp);
		
	}

}
