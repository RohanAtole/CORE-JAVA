package variablesdatatypes;

//class - class -> extends
//class - interface -> implements
//interface - interface -> extends

interface L{
	
	int age = 12;			//variables in interface is final and static.
	String area = "Pune";	//Thats way need to initialize them
	
	void show();
	void config();
}

interface C{
	void run();
}

//In interface to interface inheritance is valid so use extends instead of implements.
interface O extends C{
	
}

//In interface have to implements multiple interfaces. 
class F implements L,O{   //implements, if the interface is an
	public void show() {
		System.out.println("In show...");
	}
	public void config() {
		System.out.println("In config.....");
	}
	public void run() {
		System.out.println("In run......");
	}
}

public class interfaceImplement{
	public static void main(String args[]) {
		F obj = new F();
		obj.show();
		obj.config();	
		obj.run();
		
		//If the any variable is static them you can print directly using class name and interface name.
		System.out.println(L.area);
	}
}
