package ConstructorConcepts;

public class ConstructorConsepts04 {

	int age;
	String name;

	public ConstructorConsepts04(int age, String name) {
		System.out.println("Parameterized constructor called");
		this.age = age;
		this.name = name;
	}

	public void display() {
		System.out.println(age + " " + name);
	}

	public static void main(String[] args) {
		ConstructorConsepts04 CC01 = new ConstructorConsepts04(25, "Pradip");
		ConstructorConsepts04 CC02 = new ConstructorConsepts04(59, "Ashok");
		CC01.display();
		CC02.display();
	}
}
