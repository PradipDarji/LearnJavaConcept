package InheritanceConcepts;

public class ParentClass02 {
	public int i = 50;
	final public int j = 30;
	String name = "Pradp";
	private char c = 'C';
	protected double d = 10.00;

	public void test01() {
		System.out.println("public method");
	}

	void test02() {
		System.out.println("default method");
	}

	protected void test03() {
		System.out.println("protected method");
	}

	private void test04() {
		System.out.println("private method");
	}
	
	final public void test05() {
		System.out.println("final public method");
	}
}
