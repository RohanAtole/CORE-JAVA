package variablesdatatypes;

enum Lapttop{
	Macbook(2000), XPS(2200), Surface(1500), ThinkPad(1800);
	
	private int price;

	private Lapttop(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class enums2{
	public static void main(String args[]) {
		/*
		 * Lapttop lap = Lapttop.Macbook; System.out.println(lap +":"+lap.getPrice());
		 */
		
		for(Lapttop lap : Lapttop.values()) {
			System.out.println(lap + ":" + lap.getPrice());
		}
	}
}
