package MethodOverriding;

public class ChildClass extends ParentClass {

	public int test01(int a, int b) {
		int c = a - b;
		System.out.println("I am from child class method test01() => " + c);
		return c;
	}

	public static void main(String[] args) {
		ParentClass obj = new ChildClass();
		obj.test01(30, 10);
	}

}
