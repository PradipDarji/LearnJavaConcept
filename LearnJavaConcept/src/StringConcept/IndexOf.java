package StringConcept;

public class IndexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "To learn Java visit Javatpoint.com";
		
		int index01 = str.indexOf('J');
		System.out.println(index01);
		
		int index02 = str.indexOf("visit");
		System.out.println(index02);
		
		int index03 = str.indexOf('l', 1);
		System.out.println(index03);
		
		int index04 = str.indexOf("com", 10);
		System.out.println(index04);
		
		int index05 = str.lastIndexOf('t');
		System.out.println(index05);
		
		int index07 = str.lastIndexOf('l',10);
		System.out.println(index07);
		
		int index06 = str.lastIndexOf("visit");
		System.out.println(index06);
		
		int index08 = str.lastIndexOf("learn",10);
		System.out.println(index08);
	}

}
