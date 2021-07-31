package ArrayConcept;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int copyFrom[] = { 05, 10, 15, 20, 15, 35, 45, 96, 100 };

		int copyTo[] = new int[3];

		System.arraycopy(copyFrom, 1, copyTo, 0, 3);

		System.out.println(copyTo.length);

		for (int i = 0; i < copyTo.length; i++) {
			System.out.println(copyTo[i]);
		}

	}

}
