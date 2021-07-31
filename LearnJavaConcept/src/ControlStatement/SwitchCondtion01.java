package ControlStatement;

public class SwitchCondtion01 {
	/*
	 * Important Points to Understand :-
	 * 
	 * The Java switch statement executes one statement from multiple conditions.
	 * Every case end with break keyword.
	 */

	static String month = "February";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switch (month) {
		case "January":
			System.out.println("Selected Month is:" + month);
			break;
		case "February":
			System.out.println("Selected Month is:" + month);
			break;
		case "March":
			System.out.println("Selected Month is:" + month);
			break;
		case "April	":
			System.out.println("Selected Month is:" + month);
			break;
		case "May":
			System.out.println("Selected Month is:" + month);
			break;
		case "June":
			System.out.println("Selected Month is:" + month);
			break;
		case "July":
			System.out.println("Selected Month is:" + month);
			break;
		case "August":
			System.out.println("Selected Month is:" + month);
			break;
		case "September":
			System.out.println("Selected Month is:" + month);
			break;
		case "October":
			System.out.println("Selected Month is:" + month);
			break;
		case "November":
			System.out.println("Selected Month is:" + month);
			break;
		case "December":
			System.out.println("Selected Month is:" + month);
		default:
			System.out.println("Invalid month name");
			break;
		}
	}

}
