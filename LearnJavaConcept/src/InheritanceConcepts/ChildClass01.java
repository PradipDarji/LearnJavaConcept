package InheritanceConcepts;

public class ChildClass01 extends ParentClass01 {

	String collegeName = "SSEC";
	
	public void test03() {
		System.out.println("I am child class method 'test03()' ");
	}

	public static void main(String[] args) {
		// By creating object of child class you can access method and variables of parent class as well as child class
		ChildClass01 CC01 = new ChildClass01();
		CC01.test01();
		CC01.test02();
		CC01.test03();
		System.out.println("I am parent class variable: "+CC01.age);
		System.out.println("I am parent class variable: "+CC01.name);
		System.out.println("I am child class variable: "+CC01.collegeName);
		
		// By creating object of parent class you can access method and variables of parent class
		ParentClass01 PP01 = new ParentClass01();
		PP01.test01();
		PP01.test02();
		System.out.println("I am parent class variable: "+PP01.age);
		System.out.println("I am parent class variable: "+PP01.name);
		
		// By creating object of child class with reference of parent class, you can access method and variables of parent class
		ParentClass01 PP02 = new ChildClass01();
		PP02.test01();
		PP02.test02();
		
		System.out.println("I am parent class variable: "+PP02.age);
		System.out.println("I am parent class variable: "+PP02.name);
		
		// By creating object of parent class with reference of child class
		//ChildClass01 CC02 = new ParentClass01();
		PP02.test01();
		PP02.test02();

		System.out.println("I am parent class variable: " + PP02.age);
		System.out.println("I am parent class variable: " + PP02.name);
	}
}
