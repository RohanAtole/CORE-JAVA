package variablesdatatypes;

interface L{
	
	int age = 12;			//variables in interface is final and static.
	String area = "Pune";	//Thats way need to initialize them
	
	void show();
	void config();
}

class F implements L{   //implements, if the interface is an
	public void show() {
		System.out.println("In show...");
	}
	public void config() {
		System.out.println("In config.....");
	}
}

public class interfaceImplement{
	public static void main(String args[]) {
		L obj = new F();
		obj.show();
		obj.config();	
		
		//If the any variable is static them you can print directly using class name and interface name.
		System.out.println(L.area);
	}
}
