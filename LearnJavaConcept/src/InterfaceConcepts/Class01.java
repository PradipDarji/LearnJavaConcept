package InterfaceConcepts;

public class Class01 implements Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class01 obj = new Class01();
		obj.test01();
		obj.test02();
		obj.test03();
		System.out.println(age);
		System.out.println(id);
	}

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("This is test01() method");
	}

	@Override
	public void test02() {
		// TODO Auto-generated method stub
		System.out.println("This is test02() method");
	}

	@Override
	public void test03() {
		// TODO Auto-generated method stub
		System.out.println("This is test03() method");
	}

}
