package variablesdatatypes;

public class simpleExceptionHanding{
	public static void main(String args[]) {
		int i = 2;
		int j = 18;
		int res;
		int nums[] = new int[5];
		String str = null;
		
		try
		{
			res = j/i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("stay in your limit");
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong"+e);
		}
		System.out.println("Program Executed Successfully.....");
	}
}
