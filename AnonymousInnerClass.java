package variablesdatatypes;

//program for Anonymous Class, see and understand it properly.

class D{
	public void show() {
		System.out.println("In show method in D");
	}
}

public class AnonymousInnerClass{
	public static void main(String a[]) {
		D obj = new D()
				{
			public void show() {
				System.out.println("In new show method");
			}
			
				};
		obj.show();
	}
}
