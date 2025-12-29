package variablesdatatypes;

public class simpleExceptionHanding{
	public static void main(String args[]) {
		int i = 0;
		int j = 18;
		int res;
		
		try
		{
			res = j/i;
			System.out.println(res);
		}
		catch(Exception e) {
			System.out.println("something went wrong....");
		}
		System.out.println("Program Executed successfully.....");
	}
}
