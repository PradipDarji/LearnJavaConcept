package InstanceInitializerBlock;

public class IIB01 {
	
	int age;
	
	{
		age = 31;
		System.out.println("Instance initializer block");
	}
	
	IIB01(){
		System.out.println("Age is: "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB01 iib01 = new IIB01();
	}

}
