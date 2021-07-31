package Abstration;

public class NormalClass04 extends Abstration04 {

	String name;
	String gender;

	NormalClass04(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass04 NC04 = new NormalClass04("Pradip", "Male");
		NC04.display();
	}

	public void display() {
		System.out.println("Name is: " + name + " & Gender is: " + gender + " & Nationality is: " + gerNationality());
	}

	@Override
	String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	String getGender() {
		// TODO Auto-generated method stub
		return gender;
	}

}
