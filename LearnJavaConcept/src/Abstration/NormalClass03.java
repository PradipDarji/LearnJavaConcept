package Abstration;

public class NormalClass03 extends Abstration03 {

	int id;

	NormalClass03(String name, String gender, int id) {
		super(name, gender);
		this.id = id;
	}

	@Override
	void work(int id) {
		// TODO Auto-generated method stub
		if(id==0) {
			System.out.println("person is not working");
		}else {
			System.out.println("person is working");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NormalClass03 NC03 = new NormalClass03("Pradip", "Male", 135);
		NC03.work(NC03.id);
		
		NormalClass03 NC04 = new NormalClass03("Vishu", "Female", 0);
		NC04.work(NC04.id);
		
		System.out.println(NC03);
	}

}
