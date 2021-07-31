package MethodOverriding;

public class ChildClass04 extends ParentClass02 {
	
	private void test01() {
		System.out.println("I am calling from parent class private method");
	}
	
	public static void test02() {
		System.out.println("I am calling from parent class public static method");
	}
	
	final public void test03() {
		System.out.println("I am calling from parent class final public static method");
	}
	
	public static void main(String[] args) {
		ParentClass02 PC02 = new ChildClass04();
		ParentClass02.test02();
		PC02.test03();
	}

}
