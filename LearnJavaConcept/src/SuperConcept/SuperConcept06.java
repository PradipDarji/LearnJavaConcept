package SuperConcept;

public class SuperConcept06 extends SuperConcept05 {

	public void test01() {
		System.out.println("I am from child class method test01()");
	}

	// super can be used to invoke immediate parent class method.
	public void display() {
		test01();
		super.test01();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConcept06 SC06 = new SuperConcept06();
		SC06.display();
	}

}
