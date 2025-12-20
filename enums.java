package variablesdatatypes;

enum Status{
	Running, failed, pending, success;
}

public class enums{
	public static void main(String args[]) {
		Status[] s = Status.values();
		for(Status ss : s) {
			System.out.println(ss +":"+ ss.ordinal());
		}
	}
}
