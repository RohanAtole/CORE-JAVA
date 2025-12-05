package variablesdatatypes;

class Laptop{
	String brand;
	int price;
	
	public String toString() {
		return "Hey";
	}
}

public class ObjectClass{
	public static void main(String args[]) {
		Laptop obj = new Laptop();
		obj.brand = "Lenona Yoga";
		obj.price = 1000;
		
		System.out.println(obj.toString());
	}
}
