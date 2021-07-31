package OOPSConcepts;

public class StaticAndNonStaticConcepts02 {

	int age = 50;
	static String name = "Ashok";

	public static void main(String[] args) {

		// How to call static variable & method?
		// 1. Directly
		staticMethod();
		System.out.println(name);

		// 2. By using class name reference
		StaticAndNonStaticConcepts02.staticMethod();
		System.out.println(StaticAndNonStaticConcepts02.name);

		// How to call non static variable & method?
		StaticAndNonStaticConcepts02 SANSC = new StaticAndNonStaticConcepts02();
		SANSC.nonStaticMethod();
		System.out.println(SANSC.age);

	}

	// Under static method only static member data called
	public static void staticMethod() {
		System.out.println("This is static method.");
		System.out.println(age);
		System.out.println(name);
	}

	// Under not-static method static & non-static member data called
	public void nonStaticMethod() {
		System.out.println("This is non static method.");
		System.out.println(age);
		System.out.println(name);
	}
}
