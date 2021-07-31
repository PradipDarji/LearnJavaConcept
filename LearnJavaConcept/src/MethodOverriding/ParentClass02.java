package MethodOverriding;

public class ParentClass02 {
	
	private void test01() {
		System.out.println("I am calling from parent class private method");
	}
	
	public static void test02() {
		System.out.println("I am calling from parent class public static method");
	}
	
	final public void test03() {
		System.out.println("I am calling from parent class final public method");
	}
}
