/*This is the program of interface
 * interface does not have body
 * in them we able to declare the variable, methods and functions.*/
package oops.inheritance;

interface P{
	void show();
}

interface Q {
	void display();
}

class R implements P,Q{
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
