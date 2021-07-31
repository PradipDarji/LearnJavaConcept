package Aggression;

public class Employee {

	int id;
	String name;
	Address address;

	Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public void display() {
		System.out.println("Employee id is: " + id + " && " + "Employee name is: " + name);
		System.out.println("City name is: " + address.city + " && " + "state name is: " + address.state
				+ "Country name is: " + address.country);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address01 = new Address("Surat", "Gujarat", "India");
		Address address02 = new Address("Baroda", "Gujarat", "India");
		
		Employee obj1 = new Employee(35,"Pradip",address01);
		obj1.display();
		Employee obj2 = new Employee(35,"Pradip",address02);
		obj2.display();
		
	}

}
