package ArrayConcept;

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number[] = { 10, 20, 30, 40, 50 };

		System.out.println(number.length);
		System.out.print("[");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		System.out.print("]");
	}

}
