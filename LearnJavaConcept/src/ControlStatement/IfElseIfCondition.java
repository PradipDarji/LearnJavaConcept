package ControlStatement;

public class IfElseIfCondition {
	/*
	 * Important Points to Understand :-
	 * 
	 * if else if check on condition with multiple else if statement condition and
	 * it will execute peace of code on specific matched condition block.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		voterCandidateAge(20);
		voterCandidateAge(2);
		voterCandidateAge(6);

	}

	public static void voterCandidateAge(int age) {
		if (age > 18) {
			System.out.println("Candidate able to do vote");
		} else if (age < 5) {
			System.out.println("Candidate is not aplicable for vote");
		} else {
			System.out.println("Invalid age");
		}
	}
}
