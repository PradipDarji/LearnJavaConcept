package StringConcept;

public class StringExample01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. By Literal
		String s1 = "Pradip Darji";
		
		// 2. By using new keyword
		String s2 = new String("Test Automation");
		String s3 = new String();
		s3 = "Test User";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 3. Convert char to String
		
		char name[] = {'P','R','A','D','I','P','D','A','R','J','I'};
		
		String s4 = new String(name);
		
		System.out.println(s4);

	}

}
