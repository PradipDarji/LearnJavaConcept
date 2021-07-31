package StringConcept;

public class GetChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "To learn Java visit Javatpoint.com";
		char[] ch = new char[10]; 
		
		str.getChars(5, 10, ch, 0);
		System.out.println(ch);

	}

}
