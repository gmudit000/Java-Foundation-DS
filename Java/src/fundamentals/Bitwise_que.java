package fundamentals;

public class Bitwise_que {

	public static void main(String[] args) {
//		int a=10,b=20;
//	    int c=a&b;
//	    System.out.print(c);
//	    int d=a|b;
//	    System.out.print(d);
//	    int e=a^b;
//	    System.out.println(e);
//	    int f=c+d+e;
//	    System.out.print(~f);
	    
//	    int a=10,b=-20;
//	   // System.out.print(a^b);
//	    
//	    System.out.println(a<<1);
		
//		int x , y = 1;
//        x = 10;
//        if (x != 10 && x / 0 == 0)
//            System.out.println(y);
//        else
//            System.out.println(++y);
	
			int x = 15;
		   // int y = x++;
		    int  z = ++x;
		    System.out.println(x +" " + z);
	
	int p = 10;
	int s = p+1;
	System.out.println(s);
	System.out.println(p);
	
//		int a=5;
//	    a = a + 5+(++a)+(a++);
//	    System.out.print(a);
//	
//	  int b=5;
//	    b = 5+(++b)+(b++) + b;
//	    System.out.print(b);
	
	int a=10;
    a+=++a-5/3+6*a;
    System.out.print(a);
	}
}