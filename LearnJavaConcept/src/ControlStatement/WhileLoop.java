package ControlStatement;

public class WhileLoop {

	public static void main(String[] args) {

		int i = 0;
		while (i < 9) {
			System.out.println(i++);
		}
		System.out.println("**********************");
		int k = 0;
		while (k < 9) {
			k++;
			System.out.println(k);
		}
		System.out.println("**********************");
		int j = 5;
		while (j > 0) {
			j--;
			System.out.println(j);
		}
		System.out.println("**********************");
		int p = 5;
		while (p > 0) {
			System.out.println(p--);
		}
		System.out.println("**********************");
		int n = 0;
		int sum = 0;
		while (n <= 9) {
			sum = sum + n++;
			System.out.println("Value of n is: " + n + " && Value of sume is: " + sum);
		}
		System.out.println("Total sum is: " + sum);

	}

}
