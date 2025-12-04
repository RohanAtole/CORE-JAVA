package oops.polymorphism;

//final - Variable, method, class.

final class Reserve{ //If your class is final then you should do not inherit another class.
	
}

class Calc{        
	public void show() {
		System.out.println("By Dhiraj");
	}
	public void add(int a,int b) {
		System.out.println(a+b);
	}
}

class AdvCalc extends Calc{
	public void show() {
		System.out.println("By Rohan");
	}
}

public class FinalKeyword{
	public static void main(String args[]) {
		
		final int num = 10;  //we can change value
		System.out.println(num);
		
		AdvCalc obj = new AdvCalc();
		obj.show();
		obj.add(2, 3);
	}
}
