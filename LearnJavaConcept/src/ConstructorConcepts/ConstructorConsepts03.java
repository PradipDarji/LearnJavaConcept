package ConstructorConcepts;

public class ConstructorConsepts03 {
	
	public ConstructorConsepts03(int a) {
		System.out.println("Parameterized constructor called");
	}

	public static void main(String[] args) {
		/*
		 * When you have declare parameterized constructor and you are trying to create object of default constructor then compile error will occurred.
		 */
		ConstructorConsepts03 CC01 = new ConstructorConsepts03();
		ConstructorConsepts03 CC02= new ConstructorConsepts03(10);
	}

}
