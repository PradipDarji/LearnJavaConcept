package SuperConcept;

public class SuperConcept04 extends SuperConcept03 {

	int salary;

	// super() can be used to invoke immediate parent class constructor.
	SuperConcept04(int age, String name, int salary) {
		super(age, name);
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name is: " + name + " Age is: " + age + " Salary is: " + salary);
	}

	public static void main(String[] args) {
		SuperConcept04 SC04 = new SuperConcept04(20, "Pradip", 5000);
		SC04.display();
	}

}
