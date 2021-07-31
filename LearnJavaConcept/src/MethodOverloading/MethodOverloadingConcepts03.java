package MethodOverloading;

public class MethodOverloadingConcepts03 {
    
	/* 
	 * Can we overload java main() method? => Yes
     * You can have any number of main methods in a class by method overloading. 
     * But JVM calls main() method which receives string array as arguments only. Let's see the simple example:
     */
	
	public static void main(String[] args) {
		System.out.println("main(String[] args)");
		
		MethodOverloadingConcepts03.main("Pradip");
		MethodOverloadingConcepts03.main(10);
	}
	
	public static void main(String args) {
		System.out.println("main(String args)");
	}
	
	public static void main(int args) {
		System.out.println("main(int args[])");
	}

}
