package Abstration;

public class NormalClass01 extends Abstration01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstration01 abc = new NormalClass01();
		abc.test01();
		abc.test02();
		abc.test03();
		abc.test04();
	}

	@Override
	public void test01() {
		// TODO Auto-generated method stub
		System.out.println("Unmplemented test01() method from abstract class");
	}

	@Override
	void test02() {
		// TODO Auto-generated method stub
		System.out.println("Unmplemented test02() method from abstract class");
	}

	@Override
	protected void test04() {
		// TODO Auto-generated method stub
		System.out.println("Unmplemented test04() method from abstract class");
	}

}
