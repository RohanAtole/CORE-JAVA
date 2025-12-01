package oops;

class X{
	public X() {
		System.out.println("object is the created");
	}
	public void show() {
		System.out.println("in A show");
	}
}
public class RefereneceCreation{
	public static void main(String args[]) {
		
		int marks;
		marks = 90;   //same formate follow:
		
		X obj;			//Reference Creation
		obj = new X();	//creating object and value assigned to obj.
		obj.show();
	}
}
