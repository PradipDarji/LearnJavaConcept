package InheritanceConcepts;

public class ClassC extends ClassB {
	// Multilevel Inheritance
	public void methodC() {
		System.out.println("ClassB methodC");
	}
	
	public static void main(String[] args) {
		ClassC obj = new ClassC();
		obj.methodA();
		obj.methodB();
		obj.methodC();
	}
}
