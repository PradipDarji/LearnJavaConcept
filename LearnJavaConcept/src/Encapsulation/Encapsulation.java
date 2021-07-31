package Encapsulation;

public class Encapsulation {

	private String name;
	private String bankname;
	private int accountnumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation encaps = new Encapsulation();
		encaps.setName("James Gasoling");
		encaps.setBankname("Bank of America");
		encaps.setAccountnumber(456464899);

		System.out.println("Customer name is: " + encaps.getName());
		System.out.println("Customer bank name is: " + encaps.getBankname());
		System.out.println("Customer account number is: " + encaps.getAccountnumber());
	}

}
