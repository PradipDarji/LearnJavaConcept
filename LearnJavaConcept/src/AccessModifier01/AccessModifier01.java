package AccessModifier01;

public class AccessModifier01 {

	public int i = 50;
	String name = "Pradp";
	private char c = 'C';
	protected double d = 10.00;

	public static void main(String[] args) {
		AccessModifier01 AM01 = new AccessModifier01();
		AM01.test01();
		AM01.test02();
		AM01.test03();
		AM01.test04();
		AM01.test05();

		System.out.println(AM01.c);
		System.out.println(AM01.name);
		System.out.println(AM01.i);
		System.out.println(AM01.d);
	}

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
