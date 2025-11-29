package OOPS;

class Humann{
	
	private int age;
	private String name;
	
	public Humann() {
		
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
		Humann obj = new Humann();
		System.out.println(obj.getName() +":"+obj.getAge());
	}
}
