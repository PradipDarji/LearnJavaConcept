package BasicJavaConcept;

public class JavaVariable {
	
	/* Important Points to Understand :-
	 * 
	 * Variable stands for to reserve memory area in Java. Variable contain with data type. Data type can be anything int,char,String etc.
	 * There are three type of variable
	 * 1) Local Variable => It will declare inside the method.
	 * 2) Instant OR Global Variable => It will declare inside the class but out side the method.
	 * 3) Static Variable => Static variable contain with static keyword.
	 */
	
	int age = 20; //Instant OR Global Variable
	static String name = "Pradip"; //Static Variable
	
	public void add() {
		int a = 10; // Local Variable
		int b = 20; // Local Variable
		int c = a+b; // Local Variable
		System.out.println("Local variable sum: "+c);
	}
	
	public static void main(String[] args) {
		JavaVariable JV = new JavaVariable();
		JV.add();
		System.out.println("Instant or Global variable: "+JV.age);
		System.out.println("Static variable: "+name); //Static variable called directly
		System.out.println("Static variable: "+JavaVariable.name); //Static variable called with class name
		System.out.println("Static variable: "+JV.name); //Static variable called With class object reference
	}

}
