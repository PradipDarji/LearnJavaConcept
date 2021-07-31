package BasicJavaConcept;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaOperators JO = new JavaOperators();
		JO.arithmeticOperatorConcept();
		JO.relationalOperatorConcept();
		JO.unaryOperatorConcept();
		JO.ternaryOperatorConcept();
		JO.logicalOperatorConcept();
		JO.bitwiseOperatorConcept();
		JO.shiftOperatorConcept();
		JO.assignmentOperatorConcept();
	}

	// Arithmetic Operator (* / % + -)
	public void arithmeticOperatorConcept() {
		System.out.println(
				"******************************************Arithmetic Operator************************************************");
		int a = 10;
		int b = 20;

		System.out.println("Addition of two variable =>" + (a + b));
		System.out.println("Subtraction of two variable =>" + (b - a));
		System.out.println("Multiplication of two variable =>" + (a * b));
		System.out.println("Division of two variable =>" + (b / a));
		System.out.println("Percentage of two variable =>" + (a % b));
	}

	// Relational Operator (== != < > <= >=)
	public void relationalOperatorConcept() {
		System.out.println(
				"******************************************Relational Operator************************************************");
		int P = 30;
		int Q = 50;
		int Z = P;
		int X = 30;
		int Y = 30;

		if (P == Z) {
			System.out.println("P and Z values are same");
		} else {
			System.out.println("P and Z values are not same");
		}

		if (P != Q) {
			System.out.println("P and Q values are not same");
		} else {
			System.out.println("P and Q values are same");
		}

		if (P > Q) {
			System.out.println("P is greater than Q");
		} else {
			System.out.println("P is not greater than Q");
		}

		if (P < Q) {
			System.out.println("P is less than Q");
		} else {
			System.out.println("P is not less than Q");
		}

		if (P >= X) {
			System.out.println("P is greater than or equal to X");
		} else {
			System.out.println("P is not greater than or equal to X");
		}

		if (P <= Y) {
			System.out.println("P is less than Q or equal to Y");
		} else {
			System.out.println("P is not less than Q or equal to Y");
		}
	}

	// Unary Operator
	public void unaryOperatorConcept() {
		System.out.println(
				"******************************************Unary Operator************************************************");
		int K = 20;
		int P;

		P = ++K + K++ + K-- + K++ + --K;

		System.out.println("The value of P is " + K);

		System.out.println("The value of P is " + (++K));

		System.out.println("The value of P is " + (K++));

		System.out.println("The value of P is " + (K--));

		System.out.println("The value of P is " + (K++));

		System.out.println("The value of P is " + (--K));

		System.out.println("The value of P is " + P);
	}

	// Ternary Operator
	public void ternaryOperatorConcept() {
		System.out.println(
				"******************************************Ternary Operator************************************************");
		int C = 15;
		int D = 10;
		int F = 25;
		int min;

		min = C > F ? C : F;
		System.out.println(min);

		min = D < F ? D : F;
		System.out.println(min);

	}

	// Logical Operator
	public void logicalOperatorConcept() {
		System.out.println(
				"******************************************Logical Operator************************************************");
		boolean J = true;
		boolean K = false;

		System.out.println(J || K);
		System.out.println(J && K);
		System.out.println(J ^ K);
	}

	// Bitwise Operator
	public void bitwiseOperatorConcept() {
		System.out.println(
				"******************************************Bitwise Operator************************************************");
		boolean S = true;
		boolean T = false;

		System.out.println(S | T);
		System.out.println(S & T);
	}

	// Shift Operator
	public void shiftOperatorConcept() {
		System.out.println(
				"******************************************Shift Operator************************************************");
		// Java Left Shift Operator Example
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240 
		
		// Java Right Shift Operator Example
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
	}
	
	// Assignment Operator
	public void assignmentOperatorConcept() {
		System.out.println(
				"******************************************Assignment Operator************************************************");
		int U = 25;
		
		U+= 3;
		System.out.println(U);
		U-= 3;
		System.out.println(U);
		U/= 3;
		System.out.println(U);
		U%= 3;
		System.out.println(U);
	}

}
