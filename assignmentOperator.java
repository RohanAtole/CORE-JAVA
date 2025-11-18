package Variables_DataTypes;

public class assignmentOperator{
	
	public static void main(String args[]) {
		
		int num1=7;
		int num2=5;
		
		//following are the Assignment operators
		
		boolean result = num1 < num2;
		System.out.println(result);
		
		boolean res = num1 > num2;
		System.out.println(res);
		
		boolean ress = num1 >= num2;
		System.out.println(ress);
		
		boolean op = num1 <= num2;
		System.out.println(op);
		
		boolean ope = num1 == num2;
		System.out.println(ope);
		
		boolean opr = num1 != num2;
		System.out.println(opr);
		
		System.out.println(num1);
		
		//these three is same
		System.out.println("these three is same");
		
		num1--;				//post - decrement
		System.out.println("post - decrement:"+num1);
		
		--num1;				//pre - decrement
		System.out.println("pre - decrement:"+num1);
		
		num1-=1;
		System.out.println(num1);
		
		num1=num1-1;
		System.out.println(num1);
		
		//these three is same
		System.out.println("these three is same");
		
		num1+=1;
		System.out.println(num1);
		
		++num1;						//pre- increment
		System.out.println("pre- increment:"+num1);
		
		num1++;						//post- increment
		System.out.println("pre- increment:"+num1);
		
		num1=num1+1;
		System.out.println(num1);
		
	}
}
