package InstanceInitializerBlock;

public class IIB02 {
	
	{
		System.out.println("Instance initializer block => First");
	}
	
	{
		System.out.println("Instance initializer block => Second");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB02 iib02 = new IIB02();
		IIB02 iib03 = new IIB02();
	}

}
