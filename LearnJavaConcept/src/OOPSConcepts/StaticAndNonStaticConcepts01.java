package OOPSConcepts;

public class StaticAndNonStaticConcepts01 {

	int age = 50;
	static String name = "Ashok";

	public static void main(String[] args) {

		// How to call static variable & method?
		// 1. Directly
		staticMethod();
		System.out.println(name);

		// 2. By using class name reference
		StaticAndNonStaticConcepts01.staticMethod();
		System.out.println(StaticAndNonStaticConcepts01.name);

		// How to call non static variable & method?
		StaticAndNonStaticConcepts01 SANSC = new StaticAndNonStaticConcepts01();
		SANSC.nonStaticMethod();
		System.out.println(SANSC.age);

	}

	public static void staticMethod() {
		System.out.println("This is static method.");
	}

	public void nonStaticMethod() {
		System.out.println("This is non static method.");
	}
}
