package Abstration;

public class NormalClass02 extends Abstration02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass02 NC02 = new NormalClass02();
		NC02.test01();
		NC02.test02();
		NC02.test03();
	}

	@Override
	public void test02() {
		// TODO Auto-generated method stub
		System.out.println("This test02() calling from interface");
	}

	@Override
	public void test03() {
		// TODO Auto-generated method stub
		System.out.println("This test03() calling from interface");
	}

}
