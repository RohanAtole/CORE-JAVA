package Variables_DataTypes;

public class ternaryOperator{
	
	public static void main(String args[]) {
		
		int n=5;
		int result=0;
		
		/* if(n%2==0) {
			result=10;
		}else {
			result=20;
		}
		System.out.println("result is:"+result);
		*/
		
		//instead of above block we use
		
		result = n%2==0 ? 10 :20;
		System.out.println("result is :"+result);
	}
}
