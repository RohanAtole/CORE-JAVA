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
		Laptop obj1 = new Laptop();
		obj1.brand = "Lenona Yoga";
		obj1.price = 1000;
		
		Laptop obj2 = new Laptop();
		obj2.brand = "Lenona Yoga";
		obj2.price = 1000;
		
		boolean result = obj1.equals(obj2);
		
		System.out.println(result);
		
		System.out.println(obj1.toString());
	}
}
