package variablesdatatypes;

public class ThrowExample2{
	public static void main(String args[]) {
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0)
				throw new ArithmeticException();
		}
		catch(ArithmeticException e){
			j = 18/1;
			System.out.println("Thats a default Output");
		}
		finally {
			System.out.println(j);
			System.out.println("Executed Successfully.....");
		}
	}
}
