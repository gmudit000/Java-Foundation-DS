package class_object_practice;

public class Student_Use {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mudit" , 50);
		s1.setRollNo(-100);
		System.out.println(s1.getRollNo());
	}

}
