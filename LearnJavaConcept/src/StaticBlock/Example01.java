package StaticBlock;

public class Example01 {

	static int age;
	static String name;
	int id;

	static {
		age = 55;
		name = "Ashokbhai Darji";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Customer name is: " + name + " && Customer age is:" + age);
	}

}
