package Variables_DataTypes;

public class ifElseStatement{
	
	public static void main(String args[]) {
		
		int num1 = 100;
		int num2 = 20;
		int num3 = 15;
		
		if(num1 < num2) {
			System.out.println(num2 + "is greater");
		}
		else {
			System.out.println(num1 + "is greater");
		}
		
		//for checking three numbers 
		
		if(num1 < num2 && num2 < num3 && num2 < num3) {
			System.out.println(num3 +"is greater");
		}
		else if(num1 < num2 && num2 > num3 && num1 < num3) {
			System.out.println(num2 +"is greater");
		}
		else {
			System.out.println(num1 +"is greater");
		}
		
	}
}
