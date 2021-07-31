package InstanceInitializerBlock;

public class IIB05 extends IIB04{

	IIB05() {
		System.out.println("Child class constructor");
	}

	{
		System.out.println("Child class IIB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IIB05 iib05 = new IIB05();
	}

}
