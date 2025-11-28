package OOPS;

class Phone1{
	String brand;
	int price;
	static String name;
	
	static{
		name = "SmartPhone";
		System.out.println("In static block");
	}
	 
	public Phone1() {
		brand = "";
		price = 200;
		System.out.println("In constuctor");
	}
	
	public void show() {
		System.out.println(brand +":"+price+":"+name);
	}
	
	public static void show1() {
		System.out.println("In static method");
	}
}


public class classOperations{
	public static void main(String a[]) {
		Phone1 obj = new Phone1();
		obj.brand = "Samsung";
		Phone1.name = "SmartPhone";//static class keyword
		obj.show();
		Phone1.show1();  //static method
	}
}
