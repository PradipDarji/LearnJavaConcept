package Abstration;

public abstract class Abstration03 {

	String name;
	String gender;

	Abstration03(String name, String gender) {
		this.name = name;
		this.gender = gender;
	}
	
	abstract void work(int id);

	public void changeName(String changeName) {
		name = changeName;
	}

	@Override
	public String toString() {
		return "Abstration03 [name=" + name + ", gender=" + gender + "]";
	}

}
