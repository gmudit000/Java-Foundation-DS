package classesandobjects;

public class ComplexNumber {
	int Real;
	int Img;
	
	public ComplexNumber(int Real, int Img) {
		this.Real = Real;
		this.Img = Img;
	}
	
	public void print() {
		System.out.println(this.Real + "+" +  "i" + this.Img);
	}
	
	// setter//////////////////////
	public void setReal(int Real) {
		this.Real = Real;
	}
	
	public void setImg(int Img) {
		this.Img = Img;
	}
	///////////////////////////////

	public void add(ComplexNumber c2) {
		// this -> c1
		this.Real = this.Real + c2.Real;
		this.Img = this.Img + c2.Img;
	}

	public void multiply(ComplexNumber c2) {
		// this -> c3
		ComplexNumber temp1 = new ComplexNumber(0,0);
		ComplexNumber temp2 = new ComplexNumber(0,0);

		temp1.Real = c2.Real*this.Real;
		temp1.Img = c2.Real*this.Img;
		
		temp2.Real = -(c2.Img*this.Img);
		temp2.Img = c2.Img*this.Real;
		
		temp1.add(temp2);
		this.Real = temp1.Real;
		this.Img = temp1.Img;
		
		// this is wrong because, this.Real got updated at line 49 and updated value is used in next line
//		System.out.println(this.Img);
//		this.Real = c2.Real*this.Real - c2.Img*this.Img;
//		this.Img = c2.Real*this.Img + c2.Img*this.Real;
//		
		
		// this is right 
//		int newReal = c2.Real*this.Real - c2.Img*this.Img;
//		int newImg = c2.Real*this.Img + c2.Img*this.Real;
//		this.Real = newReal;
//		this.Img = newImg;
		
		
	}

	public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
		
		int newReal = c1.Real + c2.Real;
		int newImg = c1.Img + c2.Img;
		
		ComplexNumber temp = new ComplexNumber(newReal,newImg);
		return temp;
	}

}
