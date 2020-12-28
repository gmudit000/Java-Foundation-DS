package classesandobjects;

public class Fraction {
	int numerator;
	int denominator;
	
//	// constructor
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
		simplify();	
	}
	
	private void simplify() {
			
		int gcd = 1;
		int smaller = Math.min(numerator, denominator);
		for(int i = 2; i<=smaller; i++) {
			if(numerator%i == 0 && denominator%i==0) {
				gcd = i;
			}
		}
		numerator = numerator/gcd;
		denominator= denominator/gcd;
		} 

// getter and setter
//	public void setNumerator(int numerator) {
//		this.numerator = numerator;
//	}
//	
//	public void setDenominator(int denominator) throws DenominatorCannotBeZero {
	// you can throw exception like this
//		if(denominator==0) {
//			throw new DenominatorCannotBeZero();
//		}
//		this.denominator = denominator;
//	}
	
	// current object is f1. so, f1+f2, then it is stored in f1 only
	// this -> f1
	public void add(Fraction f2) {
		this.numerator = (this.numerator*f2.denominator) + (f2.numerator*this.denominator);
		this.denominator = (this.denominator*f2.denominator);
		simplify();
	}

	// making one static function, result is stored in another object then
	public static Fraction add(Fraction f1, Fraction f2){
		int newNum = (f1.numerator*f2.denominator) + (f2.numerator*f1.denominator);
		int newDeno = (f1.denominator*f2.denominator);
		Fraction f3 = new Fraction(newNum, newDeno);
		return f3;
	}

	public void increment() {
		numerator = numerator + denominator;
		simplify();
	}

	public void print() { 
		System.out.println(this.numerator + "/" + this.denominator);
	}

	
}
