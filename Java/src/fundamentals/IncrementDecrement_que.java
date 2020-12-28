package fundamentals;

public class IncrementDecrement_que {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 50;
//		
//		a++;
//		--b;
//		
//		int c = a--+b--;
//
//		System.out.println(++c);
		
		int a = 10, b =20;
		
		System.out.println(a+++b--);
		System.out.println(a--+(++b));
		System.out.println(a++-++b);
		System.out.println(a+++(++b));
	}
}