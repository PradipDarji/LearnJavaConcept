package MethodOverloading;

public class MethodOverloadingConcepts04 {

	// byte < short < int < long < float < double

	public void test01(int a, int b) {
		System.out.println("test01(int a, int b)");
	}

	public void test01(double d, double e) {
		System.out.println("test02(double d, double e)");
	}

	public static void main(String[] args) {
		MethodOverloadingConcepts04 MOLOAD = new MethodOverloadingConcepts04();
		MOLOAD.test01(10, 20);
		MOLOAD.test01(10.95, 20.23);
		MOLOAD.test01(10.95, 20);

	}

}
