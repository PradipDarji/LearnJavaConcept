package ConstructorConcepts;

public class ConstructorConsepts01 {

	int age;
	String name;

	public ConstructorConsepts01() {
		System.out.println("Default constructor called");
	}

	public void display() {
		System.out.println(age);
		System.out.println(name);
	}

	public static void main(String[] args) {
		ConstructorConsepts01 CC = new ConstructorConsepts01();
		CC.display();
	}

}
