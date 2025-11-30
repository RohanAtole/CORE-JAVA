package OOPS;

class A extends Object{
	public A() {
		super();
		System.out.println("in A");
	}
	public A(int n) {
		super();			//super() method execute the constructor of super class.
		System.out.println("in A int");
	}
}

class B extends A{
	
	public B() {
		super();
		System.out.println("in B");
	}
	public B(int n) {
		this();      //this() method execute a constructor of same class.
		System.out.println("in B int");
	}
}

public class methodOverloading{
	
	public static void main(String args[]) {
		
		B b = new B(5);
		
	}
}
