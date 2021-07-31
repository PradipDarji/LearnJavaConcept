package OOPSConcepts;

public class ClassConcept {

	int carmodel;
	String carname;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Important Points to Understand :-
		 * new ClassConcept() => object of ClassConcept class
		 * new => new is keyword to create object of ClassConcept class
		 * CC01,CC02 & CC03 => Reference variable of ClassConcept class
		 */
		ClassConcept CC01 = new ClassConcept();
		ClassConcept CC02 = new ClassConcept();
		ClassConcept CC03 = new ClassConcept();

		CC01.carmodel = 2015;
		CC01.carname = "Duster";

		CC02.carmodel = 2019;
		CC02.carname = "XUV";

		CC03.carmodel = 2020;
		CC03.carname = "KIA";

		System.out.println("Car model is: " + CC01.carmodel + " && " + "Car name is:" + CC01.carname);
		System.out.println("Car model is: " + CC02.carmodel + " && " + "Car name is:" + CC02.carname);
		System.out.println("Car model is: " + CC03.carmodel + " && " + "Car name is:" + CC03.carname);

	}

}
