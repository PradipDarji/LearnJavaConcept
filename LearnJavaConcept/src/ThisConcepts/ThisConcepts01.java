package ThisConcepts;

public class ThisConcepts01 {

	String name;
	int age;

	// Without use this keyword compiler getting confused when the local and instance variable is same
	ThisConcepts01(String name, int age) {
		name = name;
		age = age;
	}

	public void display() {
		System.out.println("My name is " + name + " and I am " + age + " year old");
	}

	public static void main(String[] args) {
		ThisConcepts01 TC01 = new ThisConcepts01("Pradip", 30);
		ThisConcepts01 TC02 = new ThisConcepts01("Vishakha", 28);
		TC01.display();
		TC02.display();
	}

}
