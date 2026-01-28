package variablesdatatypes;


class H implements Runnable{
	public void run() {
		for(int i = 0; i <= 5; i++)
		System.out.println("Hi");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {e.printStackTrace();
		}
	}
}
class M implements Runnable{
	public void run() {
		for(int i = 0; i <= 5; i++)
		System.out.println("Hello");
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {e.printStackTrace();
		}
	}
}
public class RunThreadProgram{
	public static void main(String args[]) {
		Runnable obj1 = new H();
		Runnable obj2 = new M();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		t1.start();
		t2.start(); 
	}
}
