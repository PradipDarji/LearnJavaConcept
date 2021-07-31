package MethodOverloading;

public class MethodOverloadingConcepts01 {

	public void calculateArea(int length) {
		System.out.println("calculateArea(int length)");
	}

	public void calculateArea(int length, int width) {
		System.out.println("calculateArea(int length, int width)");
	}

	public void calculateArea(int length, int width, int Height) {
		System.out.println("calculateArea(int length, int width, int Height)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingConcepts01 MOLOAD = new MethodOverloadingConcepts01();
		MOLOAD.calculateArea(10);
		MOLOAD.calculateArea(10,20);
		MOLOAD.calculateArea(10,20,30);
	}

}
