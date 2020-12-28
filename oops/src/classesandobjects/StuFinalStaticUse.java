package classesandobjects;

public class StuFinalStaticUse {

	public static void main(String[] args) {
		
		// there any one can change that
//		StuFinalStatic.numStudent = 100;              -> make it private 
		
		StuFinalStatic s1 = new StuFinalStatic("Mudit", 8);
		StuFinalStatic s2 = new StuFinalStatic("Mohit", 83);
		
		// right way
		System.out.println(StuFinalStatic.getNumStudent());
		
		// wrong way but don't give error
//		System.out.println(s1.getNumStudent());

	}

}
