package AccessModifier02;

import AccessModifier01.AccessModifier01;

public class AccessModifier04 extends AccessModifier01{

	public static void main(String[] args) {
		AccessModifier04 AM04 = new AccessModifier04();
		AM04.test01();
		AM04.test03();
		AM04.test05();
		System.out.println(AM04.i);
		System.out.println(AM04.d);

	}

}
