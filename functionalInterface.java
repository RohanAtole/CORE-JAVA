package variablesdatatypes;

@FunctionalInterface
interface G{
	int add(int i, int j); 
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
			return i+j;
		};
		int result = obj.add(4,5);
		System.out.println(result);
	}
}
