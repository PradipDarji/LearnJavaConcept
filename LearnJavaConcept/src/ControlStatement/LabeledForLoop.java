package ControlStatement;

public class LabeledForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		aa: for (int i = 0; i <= 5; i++) {
			bb: for (int j = 0; j <= 5; j++) {
				if (i == 2 && j == 2) {
					System.out.println("Value of i is " + i + " and value of j is " + j + " under the for loop");
					break aa;
				}
				System.out.println("Value of i is " + i + " and value of j is " + j + " outside the for loop");
			}
		}

	}

}
