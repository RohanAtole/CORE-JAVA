package variablesdatatypes;

public class simpleExceptionHanding{
	public static void main(String args[]) {
		int i = 0;
		int j = 18;
		int res;
		int nums[] = new int[5];
		
		try
		{
			res = j/i;
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e) {
			System.out.println("can not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("stay in your limit");
		}
		System.out.println("Program Executed Successfully.....");
	}
}
