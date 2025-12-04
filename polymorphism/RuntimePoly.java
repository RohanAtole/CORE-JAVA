package oops.polymorphism;

class A{
	void show() {
		System.out.println("In show method an class A");
	}
}
class B extends A{
	void show() {
		System.out.println("In show method an class B");
	}

}
class C extends B{
	void show() {
		System.out.println("In show method an class C");
	}
}

public class RuntimePoly{
	public static void main(String args[]) {
		
		//Dynamic method Dispatch
		
		A obj = new A(); //referring object as B but it is A.
		obj.show();
		
		obj = new B(); //referring object as B.
		obj.show();
		
		obj = new C(); //referring object as C.
		obj.show();
	}
}
