/*In multiple inheritance we can't use class for
inherit each other instead use the interface 
for implements.*/
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
public class MultipleInheritance{
	public static void main(String args[]) {
		C obj = new C();
		obj.display();
		obj.show();
	}
}
