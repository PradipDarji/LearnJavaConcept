package MethodOverloading;

public class MethodOverloadingConcepts05 {

	// byte < short < int < long < float < double

	public void test01(int a, double b) {
		System.out.println("test01(int a, double b)");
	}

	public void test01(double a, int b) {
		System.out.println("test02(double a, int b)");
	}

	public static void main(String[] args) {
		MethodOverloadingConcepts05 MOLOAD = new MethodOverloadingConcepts05();
		MOLOAD.test01(10, 20);

	}

}
