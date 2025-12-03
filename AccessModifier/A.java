package variablesdatatypes;

class Calc{
	
	public void show() {
		System.out.println("In show");
	}
}

public class A{
	public static void main(String args[]) {
		Calc obj = new Calc();
		obj.show();
	}
}
