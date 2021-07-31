package OOPSConcepts;

public class ReturntType {

	public static void main(String[] args) {
		ReturntType RT = new ReturntType();
		RT.test1();
		RT.test2();
		RT.test3();
		RT.test4();
		RT.test5();
		RT.test6();
		RT.test7();
		RT.test8();
		RT.test9();
		RT.test10();
		RT.test11();
	}

	public void test1() {
		System.out.println("Non return type method");
	}

	public int test2() {
		System.out.println("Int type return method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String test3() {
		System.out.println("String type return method");
		String name = "Pradip Darji";
		return name;
	}

	public char test4() {
		System.out.println("Char type return method");
		char latter = 'P';
		return latter;

	}

	public boolean test5() {
		System.out.println("Boolean type return method");
		boolean flag = true;
		return flag;
	}

	public long test6() {
		System.out.println("Long type return method");
		long l = 10000000000l;
		return l;
	}

	public double test7() {
		System.out.println("Double type return method");
		double d = 10.000d;
		return d;
	}

	public short test8() {
		System.out.println("Short type return method");
		short s = 10000;
		return s;
	}

	public byte test9() {
		System.out.println("Byte type return method");
		byte a = 10;
		return a;
	}

	public ReturntType test10() {
		System.out.println("Class type return method");
		return new ReturntType();
	}

	public int[] test11() {
		System.out.println("Array type return method");
		int age[] = { 10, 20, 30, 40, 50 };
		return age;
	}
}
