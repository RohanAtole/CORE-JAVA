package OOPS;

class Human{
//	private int age = 11;
//	private String name = "Rohan";
	
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String a) {
		name = a;
	}
}

public class encapsulation{
	public static void main(String args[]) {
		Human obj = new Human();
		
		 obj.setAge(30); 
		 obj.setName("Rohan");
		 
		
		System.out.println(obj.getName()+":"+obj.getAge());
	}
}
