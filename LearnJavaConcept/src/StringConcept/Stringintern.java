package StringConcept;

public class Stringintern {

	public static void main(String[] args) {

		/*
		 * Java String intern() method is used for getting the string from the memory if
		 * it is already present.
		 */

		String s1 = "Javatpoint";
		String s2 = s1.intern();
		String s3 = new String("Javatpoint");
		String s4 = s3.intern();
		System.out.println(s1 == s2); // True
		System.out.println(s1 == s3); // False
		System.out.println(s1 == s4); // True
		System.out.println(s2 == s3); // False
		System.out.println(s2 == s4); // True
		System.out.println(s3 == s4); // False
	}

}
