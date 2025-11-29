package OOPS;

class Human1{
	
	private int age;
	private String name;
	
	public Human1() {
		
		age = 12;
		name = "John";
		System.out.println("In constructor");
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}

public class constructor{
	public static void main(String args[]) {
		Human1 h1 = new Human1();
		System.out.println(h1.getName() +":"+h1.getAge());
	}
}
