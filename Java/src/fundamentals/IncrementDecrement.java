package fundamentals;

public class IncrementDecrement {

	public static void main(String[] args) {
		
		int a =60; int b =80;
		//if(a++>60 && b++>80) {	// read about short circuiting
		//if(++a>60 && b++>80) {	
		if(++a>60 || b++>80) {		// short circuiting
			System.out.println("Inside if");
		}else {
			System.out.println("Inside else");
		}
		System.out.println("a " + a + " b " + b);
		
//		int a = 60;
//		
//		int b = a++;
//		System.out.println(a);
//		System.out.println(b);
		
		//System.out.println(a++);  post increment  
		//System.out.println(++a);   pre increment
		//System.out.println(a);
		
	}
}