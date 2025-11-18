package Variables_DataTypes;

public class logicalOperator{
	
	public static void main(String args[]) {
		
		int num1 = 10;
		int num2 = 20;
		
		boolean a=false;
		
		//for AND operator
		if (num1 < num2 && num1 > num2) {
			System.out.println("this is for AND condition :"+true);
		}
		else {
			System.out.println("this is for AND condition :"+false);
		}
		
		//for OR operator
		
		if (num1 > num2 || num1 < num2) {
			System.out.println("this is for OR condition :"+true);
		}
		else {
			System.out.println("this is for OR condition :"+false);
		}
		
		
		//for NOT operator
		
		boolean result=!a;
		
		System.out.println("this is for NOT :"+result);
		
		
		
	}
}
