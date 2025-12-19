package variablesdatatypes;

//implementation of the Abstract class and Anonymous class.

abstract class J{
	public abstract void show();
	public abstract void config(String msg); 
}
public class abstractAndAnonymousClass{
	public static void main(String a[]) {
		J obj = new J()  //create the object of this anonymous class. 
			{
				public void show() {
					System.out.println("new show");
				}
				
				public void config(String msg) {
					System.out.print("config : "+msg);
				}
			};
		obj.show();
		obj.config("Successfully completed....");
	}
}
