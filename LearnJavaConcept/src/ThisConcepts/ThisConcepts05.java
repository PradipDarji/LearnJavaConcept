package ThisConcepts;

public class ThisConcepts05 {
	
	public void test01(ThisConcepts05 obj) {
		System.out.println("I am in test01() method");
	}
	
	public void test02() {
		test01(this);
		System.out.println("I am in test02() method");
	}

	public static void main(String[] args) {
		ThisConcepts05 TC05 = new ThisConcepts05();
		TC05.test02();
	}

}
