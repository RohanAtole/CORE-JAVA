package variablesdatatypes;

@FunctionalInterface
interface G{
	void show(int i, int j); 
}

/*
 * class M implements G{ public void show() {
 * 
 * } }
 */
public class functionalInterface{
	public static void main(String args[]) {
		G obj = (int i, int j)->    //Lambda Expression show using (->) that symbol.
		{
			System.out.println("In show "+i+","+j);
		};
		obj.show(4,5);
	}
}
