package StringConcept;

public class StringFormat {

	public static void main(String[] args) {

		String s1 = "Hello world";
		String s2 = "Java Learn";
		int num = 7044; 

		String s4 = String.format(s1 + " %s", s2);
		System.out.println(s4);

		String gfg2 = String.format("My Company name" + " is: %1$s, %1$s and %2$s", s1, s2);
		System.out.println(gfg2);

		// Output is given upto 8 decimal places
		String str2 = String.format("My answer is %.8f", 47.65734);
		System.out.println(str2);

		// between "My answer is" and "47.65734000" there are 15 spaces
		String str3 = String.format("My answer is %15.8f", 47.65734);
		System.out.println(str3);
		
		String gfg3 = String.format("%07d", num); 
		  
        System.out.println(gfg3);

	}

}
