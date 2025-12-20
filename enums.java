package variablesdatatypes;

enum Status{
	Running, failed, pending, success;
}

public class enums{
	public static void main(String args[]) {
		
		Status s = Status.success;
		
		//Using Switch Statement 
		
		switch(s) {
		case Running:
			System.out.println("All Good");
			break;
			
		case failed:
			System.out.println("Try Again");
			break;
			
		case pending:
			System.out.println("Please Wait");
			break;
			
		default : System.out.println("Done");
			break;
		}
		
		//Using the If-Else condition
		
		if(s == Status.Running) {
			System.out.println("All Good");
		}
		else if(s == Status.failed) {
			System.out.println("Try Again");
		}
		else if(s == Status.pending) {
			System.out.println("Please Wait");
		}
		else {
			System.out.println("Done");
		}
	}
}
