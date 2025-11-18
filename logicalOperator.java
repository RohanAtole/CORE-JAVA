package Variables_DataTypes;

public class logicalOperator{
	
	public static void main(String args[]) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 20;
		int num4 = 10;
		boolean a=false;
		
		//for AND operator
		boolean result = num1 < num2 && num3 > num4;
		System.out.println("this is for (&&) AND :"+result);
		
		//for OR operator
		
		boolean OR = num1 > num2 || num3 < num4;
		System.out.println("this is for (||) OR :"+OR);
		
		
		//for NOT operator
		
		boolean NOT=!a;
		
		System.out.println("this is for (!) NOT :"+NOT);
		
		
		
	}
}
