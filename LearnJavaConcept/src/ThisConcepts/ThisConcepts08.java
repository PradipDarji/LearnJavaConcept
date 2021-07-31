package ThisConcepts;

public class ThisConcepts08 {

	public void test01() {
		test02();
		this.test03();
		System.out.println("I am in test01()");
	}

	// this can be applicable only for no-static
	public static void test02() {
		this.
		System.out.println("I am in test02()");
	}

	public void test03() {
		test01();
		test02();
		System.out.println("I am in test03()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
