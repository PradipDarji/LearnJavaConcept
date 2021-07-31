package ControlStatement;

public class IfElseIfConditions02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUserResult(33);
		getUserResult(55);
		getUserResult(65);
		getUserResult(75);
		getUserResult(85);
		getUserResult(95);
		getUserResult(1095);
	}
	
	public static void getUserResult(int marks) {
		 if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
	}

}
