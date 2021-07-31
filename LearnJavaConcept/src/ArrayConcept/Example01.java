package ArrayConcept;

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age[] = new int[5];
		age[0] = 10;
		age[1] = 20;
		age[2] = 30;
		age[3] = 40;
		age[4] = 50;

		System.out.println(age.length);

		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}

	}

}
