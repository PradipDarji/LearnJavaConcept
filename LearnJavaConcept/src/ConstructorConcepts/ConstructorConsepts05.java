package ConstructorConcepts;

public class ConstructorConsepts05 {

	// Is constructor Overloading is possible? => Yes

	public ConstructorConsepts05() {
		System.out.println("Default constructor or no-arg constructor");
	}

	public ConstructorConsepts05(int a, int b) {
		System.out.println("Integer parameter type constructor");
	}

	public ConstructorConsepts05(char a, char b) {
		System.out.println("Char parameter type constructor");
	}

	public ConstructorConsepts05(long a, long b) {
		System.out.println("Long parameter type constructor");
	}

	public ConstructorConsepts05(short a, short b) {
		System.out.println("Short parameter type constructor");
	}

	public ConstructorConsepts05(byte a, byte b) {
		System.out.println("Byte parameter type constructor");
	}

	public ConstructorConsepts05(String a, String b) {
		System.out.println("String parameter type constructor");
	}

	public static void main(String[] args) {
		ConstructorConsepts05 CC01 = new ConstructorConsepts05();
		ConstructorConsepts05 CC02 = new ConstructorConsepts05(10, 20);
		ConstructorConsepts05 CC03 = new ConstructorConsepts05('C', 'H');
		ConstructorConsepts05 CC04 = new ConstructorConsepts05(10000, -5000);
		ConstructorConsepts05 CC05 = new ConstructorConsepts05("Car", "Honda");
		ConstructorConsepts05 CC06 = new ConstructorConsepts05(10000L, -5000L);
	}
}
