package variablesdatatypes;

class X{  //Outer class
	
	int age;
	
	public void show() {
		System.out.print("In Outer class");
	}
	class Y{  //Inner class
		public void config(){
			System.out.println("In inner class");
		}
	}
}

public class innerClass{
	
	public static void main(String args[]) {
		X obj = new X();
		obj.show();
		
		X.Y obj1 = obj.new Y();
		obj1.config();
	}
}
