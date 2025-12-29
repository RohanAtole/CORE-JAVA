package variablesdatatypes;

public class simpleExceptionHanding{
	public static void main(String args[]) {
		int i = 2;
		int j = 18;
		int res;
		int nums[] = new int[5];
		String str = null;
		
		try   //this is try block to add suspicious block of code
		{
			res = j/i;
			System.out.println(str.length());
			System.out.println(nums[1]);
			System.out.println(nums[5]);
		}
		catch(ArithmeticException e) {    //Specified Catch block
			System.out.println("can not divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) { //This is also Specified Catch block
		System.out.println("stay in your limit");
		}
		catch(Exception e) {
			System.out.println("Something Went Wrong"+e);//This is not Specified Catch block which is able catch any exception.
		}
		System.out.println("Program Executed Successfully.....");
	}
}
