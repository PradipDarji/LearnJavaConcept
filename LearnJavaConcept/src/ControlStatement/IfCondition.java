package ControlStatement;

public class IfCondition {

	static boolean conditions;

	public static void main(String[] args) {
     // If condition only work when the mentioned condition is true until If block will always skipped and execute next after if code.
		if (conditions) {
			System.out.println("Inside the if block");
		}
		System.out.println("Outside the if block");
	}
}
