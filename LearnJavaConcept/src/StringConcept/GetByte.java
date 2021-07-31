package StringConcept;

public class GetByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "To learn Java visit Javatpoint.com";
		
		byte brr[] = str.getBytes();
		
		for(int i = 0; i<brr.length;i++) {
			System.out.println(brr[i]);
		}

	}

}
