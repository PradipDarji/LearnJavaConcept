package StringConcept;

public class ReplaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "javatpoint is a very good website";
		String s4 = "javatpoint";

		String s2 = s1.replace('s', 'p');
		System.out.println(s2);
		
		String s3 = s1.replace("o", "g");
		System.out.println(s3);
		
		String s5 = s1.replaceAll(s1, s4);
		System.out.println(s5);
		
		String s6 = s1.replaceFirst("web", "HelloWorld");
		System.out.println(s6);
	}

}
