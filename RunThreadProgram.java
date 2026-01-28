package variablesdatatypes;

class H extends Thread{
	public void run() {
		for(int i = 0; i <= 10; i++)
		System.out.println("Hi");
	}
}
class M extends Thread{
	public void run() {
		for(int i = 0; i <= 10; i++)
		System.out.println("Hello");
	}
}
public class RunThreadProgram{
	public static void main(String args[]) {
		H obj1 = new H();
		M obj2 = new M();
		
		obj1.start();
		obj2.start(); 
	}
}
