package MethodOverloading;

public class MethodOverloadingConcepts02 {
	
	public void test01(int a, int b) {
		System.out.println("test01(int a, int b)");
	}
	
	// 1. By changing number of arguments
	public void test01(int a, int b, int c) {
		System.out.println("test04(int a, int b, int c)");
	}
	
	// 2. By changing the data type
	public void test01(double a, double b) {
		System.out.println("test02(double d1, double d2)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingConcepts02 MOLOAD02 = new MethodOverloadingConcepts02();
		MOLOAD02.test01(10, 20);
		MOLOAD02.test01(10.50, 20.60);
	}

}
