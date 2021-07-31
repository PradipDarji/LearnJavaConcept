package ThisConcepts;

public class ThisConcepts03 {

	// this can be used to invoke current class method (implicitly)
	public void test01() {
		System.out.println("I am in test01() method");
	}

	public void test02() {
		this.test01();
		System.out.println("I am in test02() method");
	}

	public static void main(String[] args) {
		ThisConcepts03 TC03 = new ThisConcepts03();
		TC03.test02();
	}

}
