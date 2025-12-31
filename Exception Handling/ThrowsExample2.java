package variablesdatatypes;

class N{
	public void show() throws ClassNotFoundException {
			Class.forName("Demo");
	}
}
public class ThrowsExample2{
	public static void main(String args[]) {
		N obj = new N();
		try {
			obj.show();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
