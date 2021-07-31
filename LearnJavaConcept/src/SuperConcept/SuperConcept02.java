package SuperConcept;

public class SuperConcept02 extends SuperConcept01 {

	public String color = "black";

	public void display() {
		// super can be used to refer immediate parent class instance variable.
		System.out.println("Color is: " + super.color);
		System.out.println("Color is: " + color);
	}

	public static void main(String[] args) {
		SuperConcept02 SC02 = new SuperConcept02();
		SC02.display();
	}
}
