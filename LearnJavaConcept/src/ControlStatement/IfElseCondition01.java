package ControlStatement;

public class IfElseCondition01 {
	static boolean conditions;

	public static void main(String[] args) {
		
		/* Important Points to Understand :-
		 * 
		 * If-Else condition contain with true and false result. When if condition
		 * match program will execute code of if block, else program will execute
		 * code of else block
		 */		
		
		System.out.println("Condition value is: " + conditions);
		if (conditions) {
			System.out.println("Inside the if block");
		} else {
			System.out.println("Inside the else block");
		}
	}
}
