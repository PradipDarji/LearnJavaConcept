package ThisConcepts;

public class ThisConcepts04 {
	
	// this() can be used to invoke current class constructor.
	ThisConcepts04(){
		System.out.println("I am in ThisConcepts04() constructor");
	}
	
	ThisConcepts04(int a){
		this();
		System.out.println("I am in ThisConcepts04(int a) constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConcepts04 TC04 = new ThisConcepts04(10);
	}

}
