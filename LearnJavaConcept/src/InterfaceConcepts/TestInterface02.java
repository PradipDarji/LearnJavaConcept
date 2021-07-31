package InterfaceConcepts;

public class TestInterface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RBI rbi = new Axisbank();
		rbi.bankIntrest();
		RBI rbi01 = new HDFCbank();
		rbi01.bankIntrest();

	}

}
