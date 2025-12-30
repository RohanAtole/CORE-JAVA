package variablesdatatypes;

class RohanException extends Exception{
	public RohanException(String string) {
		
	}
}

public class UserDefinedException{
	public static void main(String args[]) {
		int i = 20;
		int j = 0;
		
		try {
			j = 18/i;
			if(j==0)
				throw new RohanException("I don't want to print Zero");
		}
		catch(RohanException e){
			j = 18/1;
			System.out.println("Thats a default Output"+e);
		}
		finally {
			System.out.println(j);
			System.out.println("Executed Successfully.....");
		}
	}
}
