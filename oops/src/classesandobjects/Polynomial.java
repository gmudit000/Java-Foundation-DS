package classesandobjects;

public class Polynomial {
	int degree;
	int coefficient;
	int[] DynArray = new int[10];;

	public void setDegreeCoefficient(int degree, int coefficient){
//		if(degree >= DynArray.length) {
//			
//		}
		DynArray[degree] = coefficient;
	}
	
	public void add(Polynomial p2) {
		int big_length = 0;
		if(this.DynArray.length >= p2.DynArray.length) {
			big_length = this.DynArray.length;
		}else{
			big_length = p2.DynArray.length;
		}
		
		// adding two polynomials
 		for(int i = 0 ; i <big_length; i++) {
 			this.DynArray[i] = this.DynArray[i] + p2.DynArray[i];
		}
	}
	
	public void multiply(Polynomial p1) {
		// new polynomial obj created
		Polynomial p=new Polynomial();
		// taking 2 loops to multiply the coeff and storing it in this newly created polnomial
		for(int i=0;i<p1.DynArray.length;i++) {
			for(int j=0;j<this.DynArray.length;j++) {
				// checking if degree is smaller to initial degree then storing
				if(i + j <=p.degree)
					p.setDegreeCoefficient( i + j ,p.DynArray[i+j]+p1.DynArray[i] * this.DynArray[j]);
				else
					// otherwise we'll not have anythig there to add so just putting multiply result
					// this is similar step just like u do in maths multiplication
					p.setDegreeCoefficient(i + j ,p1.DynArray[i] * this.DynArray[j]);
			}
		}
//		// p2 ->  this
//		int[] updatedArr = new int[10];
//		
//		for(int i = 0; i < this.DynArray.length; i++) {
//			int[] temp = new int[10];
//			for(int j = 0 ; j < p1.DynArray.length; j++) {
//				int index = i+j;
//				temp[index] = this.DynArray[i]*p1.DynArray[j];
//			}
//			// adding empty arr/ updatedArr and temp arr
//			for(int j = 0 ; j <temp.length; j++) {
//	 			updatedArr[j] = updatedArr[j] + temp[j];
//			}
//		}
//		
//		// coping all elements from updatedArr to p2/ this
//		for(int i=0;i<updatedArr.length;i++) {
//			this.DynArray[i] = updatedArr[i];
//		}
	}

	public void print() {
		for(int i = 0; i<DynArray.length; i++) {
				if(DynArray[i] != 0) {
					System.out.print(DynArray[i] + "x^" + i + " + ");
				}
		}
		System.out.println();  // new line
	}

	public static Polynomial add(Polynomial p1, Polynomial p2) {
		int big_length = 0;
		if(p1.DynArray.length >= p2.DynArray.length) {
			big_length = p1.DynArray.length;
		}else{
			big_length = p2.DynArray.length;
		}
		
		Polynomial p = new Polynomial();
		
		// adding two polynomials
 		for(int i = 0 ; i <big_length; i++) {
 			p.DynArray[i] = p1.DynArray[i] + p2.DynArray[i];
		}	
		return p;
	}
	
	// evaluate
	public int evaluate(int num) {
		int res = 0;
		for(int i = 0 ; i <DynArray.length; i++) {
			res += DynArray[i]*(Math.pow(num,i));
		}
		return res;
	}
	
}
