package AccessModifier02;

import AccessModifier01.AccessModifier01;

public class AccessModifier03 {

	public static void main(String[] args) {
		AccessModifier01 AM01 = new AccessModifier01();

		AM01.test01();
		AM01.test05();
		System.out.println(AM01.i);
	}

}
