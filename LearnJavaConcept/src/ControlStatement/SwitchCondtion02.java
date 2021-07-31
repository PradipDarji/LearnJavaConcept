package ControlStatement;

public class SwitchCondtion02 {
	/*
	 * Important Points to Understand :-
	 * 
	 * The Java switch statement executes one statement from multiple conditions.
	 * Every case end with break keyword.
	 */

	static int age = 30;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch (age) {
		case 20:
			System.out.println("Candiate is applicable for vote");
			break;
		case 15:
			System.out.println("Candiate is not applicable for vote");
			break;
		default:
			System.out.println("Invalid age");
			break;
		}
	}

}
