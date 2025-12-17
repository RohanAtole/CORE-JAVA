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
		X obj = new X();  //simply call the regular class in regular manner.
		obj.show();
		
		X.Y obj1 = obj.new Y(); //but in inner class call is different as compare to outer class.
		obj1.config();
	}
}
