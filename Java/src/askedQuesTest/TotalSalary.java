package askedQuesTest;
import java.util.Scanner;
public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int allow;
		int basicSalary = s.nextInt();
		char grade = s.next().charAt(0);
		
		if(grade == 'A') {
			allow = 1700;
		}
		else if(grade == 'B') {
			allow = 1500;
		}
		else {
			allow = 1300;
		}
		
		double hra = (20.0/100)*basicSalary;
		double da = (50.0/100)*basicSalary;
		double pf = (11.0/100)*basicSalary;
		
		double totalSalary = basicSalary + hra + da + allow - pf;
		System.out.println((int)Math.round(totalSalary));
	}

}
