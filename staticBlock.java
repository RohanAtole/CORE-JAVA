package OOPS;

class Phone{
	String brand;
	int price;
	static String name;
	
	static{
		name = "SmartPhone";
		System.out.println("In static block");
	}
	
	public Phone() {
		brand = "";
		price = 200;
		System.out.println("In constuctor");
	}
	
	public void show() {
		System.out.println(brand +":"+price+":"+name);
	}
}


public class staticBlock{
	
	public static void main(String a[]) {
		
		Phone m = new Phone();
		m.brand = "Apple";
		m.price = 1200;
		m.name = "Smartphone";
		
		m.show();
	}
}
