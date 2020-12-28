package classesandobjects;

public class FractionUse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(2,3);
		f1.print();
//		f1.increment();
//		f1.print();
		Fraction f2 = new Fraction(3,4);
		f2.print();
		
		// call through class Fraction, as add is static function
		Fraction f3 = Fraction.add(f1,f2);
		f3.print();
		
		// this add is non-static function
		f1.add(f2);
		f1.print();
		
		
		
//		f1.setDenominator(0);
//		System.out.println(f1.getDenominator());

	}

}