package OOPSConcepts;

public class MethodConcept {

	// main method start up point without main method program will not execute
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodConcept MC = new MethodConcept();
		MC.test01();
		MC.test02();
		MC.test03(10, 20);
	}

	// Void => Doen't return anything
	public void test01() {
		System.out.println("Non-return type method calling");
	}

	// Here,return type is int
	public int test02() {
		System.out.println("No input but some output");
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
		return c;
	}
	
	// Here,return type is int
	public int test03(int x, int y) {
		System.out.println("Some input but some output");
		int div = y / x;
		System.out.println(div);
		return div;
	}

}
