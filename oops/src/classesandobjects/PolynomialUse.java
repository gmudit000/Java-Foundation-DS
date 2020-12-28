package classesandobjects;

public class PolynomialUse {

	public static void main(String[] args) {
		
		Polynomial p1 = new Polynomial();
		p1.setDegreeCoefficient(0,3);
		p1.setDegreeCoefficient(1,4);
		p1.setDegreeCoefficient(2,1);
		p1.print();
		
//		System.out.println();
		Polynomial p2 = new Polynomial();
		p2.setDegreeCoefficient(0,4);
		p2.setDegreeCoefficient(1,5);
		p2.setDegreeCoefficient(2,6);
		p2.print();
		
		
		p1.add(p2);
		p1.print();
		p2.print();
		
		p2.multiply(p1);
		p2.print();
		p1.print();
		
		// create a static function
		Polynomial p3 = Polynomial.add(p1,p2);
		p3.print();
		p1.print();
		p2.print();
		
		// put x value in polynomial equation and get ans
		int ans = p2.evaluate(10);
		System.out.println(ans);
	}

}
