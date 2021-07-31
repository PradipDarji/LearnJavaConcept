package ThisConcepts;

public class ThisConcepts02 {

	String name;
	int age;

	// this can be used to refer current class instance variable.
	ThisConcepts02(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void display() {
		System.out.println("My name is " + name + " and I am " + age + " year old");
	}

	public static void main(String[] args) {
		ThisConcepts02 TC01 = new ThisConcepts02("Pradip", 30);
		ThisConcepts02 TC02 = new ThisConcepts02("Vishakha", 28);
		TC01.display();
		TC02.display();
	}

}
