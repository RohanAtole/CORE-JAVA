package oops.inheritance;

interface A{
	void show();
}

interface B {
	void display();
}

class C implements A,B{
	public void show() {
		System.out.println("show A");
	}
	
	public void display() {
		System.out.println("Display B");
	}
}
public class InterfaceProgram{
	public static void main(String args[]) {
		C obj = new C();
		obj.display();
		obj.show();
	}
}
