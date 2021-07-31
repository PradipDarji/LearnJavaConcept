package StringConcept;

public class concat {

	public static void main(String[] args) {
		
		String s1 = "Pradip";
		String s2 = "Vishakha";
		String s3 = "Darji";
		String s4;
		
		s1.concat(s2);
		System.out.println(s1);
		
		s4 = s1.concat(" ").concat(s2).concat(" ").concat(s3);
		System.out.println(s4);

	}

}
