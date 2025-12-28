package variablesdatatypes;

@FunctionalInterface
interface G{
	void show(); 
}

/*
 * class M implements G{ public void show() {
 * 
 * } }
 */
public class functionalInterface{
	public static void main(String args[]) {
		G obj = ()->    //Lambda Expression show using (->) that symbol.
		{
			System.out.println("In show");
		};
		obj.show();
	}
}
