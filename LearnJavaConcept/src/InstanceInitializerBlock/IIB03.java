package InstanceInitializerBlock;

public class IIB03 {
	
	{
		System.out.println("Instance initializer block => First");
	}
	
	{
		System.out.println("Instance initializer block => Second");
	}
	
	{
		System.out.println("Instance initializer block => Three");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB03 iib03 = new IIB03();
	}

}
