package InterfaceConcepts;

public class TestInterface03 implements InterfaceC{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface03 TC03 = new TestInterface03();
		TC03.methodA();
		TC03.methodB();
		TC03.methodC();
	}

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		System.out.println("methodA()");
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("methodB()");
	}

	@Override
	public void methodC() {
		// TODO Auto-generated method stub
		System.out.println("methodC()");
	}

}
