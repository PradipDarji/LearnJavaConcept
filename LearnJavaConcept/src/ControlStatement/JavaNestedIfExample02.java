package ControlStatement;

public class JavaNestedIfExample02 {

	public static void main(String[] args) {
		
		/*
		 * Important Points to Understand :-
		 * 
		 * Nested if condition contain with multiple if condition and once the parent if condition true
		 * than the rest of child if condition will execute.
		 * 
		 */
		
		// Creating two variables for age and weight
		int age = 20;
		int weight = 80;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			}else {
				System.out.println("You are not eligible to donate blood");
			}
		}else{  
		      System.out.println("Age must be greater than 18");  
	    }  
	}

}
