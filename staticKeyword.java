package OOPS;

class Mobile{
	
	//instance variable
	String brand;
	int price;
	static String name;    //static variable
	
	public void show() {
		System.out.println("brand: "+brand+", price: "+price +", name: "+name);
	}
}

public class staticKeyword{
	
	public static void main(String args[]) {
		
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		Mobile.name = "SmartPhone"; //we also access using class name because its static
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Samsung";
		obj2.price = 1700;
		Mobile.name = "SmartPhone";//we also access using class name because its static
		
		//if the once declare as static variable then they affect all places
		obj1.name = "Phone";
		
		obj1.show();
		obj2.show();
	}
}
