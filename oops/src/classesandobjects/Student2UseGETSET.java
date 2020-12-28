package classesandobjects;

public class Student2UseGETSET {

	public static void main(String[] args) {
		
		Student2 s1 = new Student2();
//		s1.setName("muditgarg");
//		System.out.println(s1.getName());
		
		s1.setRollNo(1000);
		System.out.println("s1 reference " + s1);
		System.out.println(s1.getRollNo());
		
		Student2 s2 = new Student2();
		s2.setRollNo(60);
		System.out.println("s2 reference " + s2);
		System.out.println(s2.getRollNo());
		

	}

}
