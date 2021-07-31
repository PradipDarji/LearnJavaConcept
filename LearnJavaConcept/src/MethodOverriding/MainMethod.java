package MethodOverriding;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass01 PC01 = new ChildClass01();
		PC01.test01();
		ParentClass01 PC02 = new ChildClass02();
		PC02.test01();
		ParentClass01 PC03 = new ChildClass03();
		PC03.test01();	
	}

}
