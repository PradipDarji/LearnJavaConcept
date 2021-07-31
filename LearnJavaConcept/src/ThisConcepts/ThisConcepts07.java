package ThisConcepts;

public class ThisConcepts07 {
	
	int i = 50;
	
	ThisConcepts07(){
		ThisConcepts06 TC06 = new ThisConcepts06(this);
	}
	
	void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConcepts07 TC07 = new ThisConcepts07();
		TC07.display();
	}

}
