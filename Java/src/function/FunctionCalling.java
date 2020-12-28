package function;

public class FunctionCalling {
	
	public static void b() {
		System.out.println("Inside b");
	}
	
	public static void a() {
		b();
		System.out.println("Inside a");
	}
	
	public static void main(String[] args) {
		a();
		System.out.println("Inside main");
	}
	
	
// question - will error come?
//	public static void func1(int a)
//	{
//	    System.out.print("a");
//	}
//	public static void main (String[] args) {
//	    func1(2.5);
//	}

}