package classesandobjects;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
	
//		Scanner s = new Scanner(System.in);
		Student s1 = new Student();
		Student s2 = new Student();
//		System.out.println(s2);
		
		s1.name = "Mudit";
		s1.rollNumber = 22;
		System.out.println(s1.name + " " + s1.rollNumber);
		
		s2.name = "Mana";
		s2.rollNumber = 52;
		System.out.println(s2.name + " " + s2.rollNumber);
		
//		System.out.println(rollNumber);
		

	}

}
