package classesandobjects;

public class MobileUse {

	public static void main(String[] args) {
		
		Mobile c=new Mobile(); 
		// year has private access
//        c.year=2018;              
        c.company_name="Apple";
        System.out.println(c.company_name); 

	}

}
