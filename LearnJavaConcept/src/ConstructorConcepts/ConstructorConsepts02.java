package ConstructorConcepts;

public class ConstructorConsepts02 {

	public ConstructorConsepts02() {
		System.out.println("Default constructor called");
	}
	
	public ConstructorConsepts02(int a) {
		System.out.println("Parameterized constructor called");
	}

	public static void main(String[] args) {
		ConstructorConsepts02 CC01 = new ConstructorConsepts02();
		ConstructorConsepts02 CC02= new ConstructorConsepts02(10);
	}

}
