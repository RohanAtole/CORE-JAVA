package OOPS;

public class stringClass{
	
	public static void main(String args[]) {
		
		String name = new String("rohan");
		
		//this two ways are same
		
		String Fname = "ROHAN";
		
		//print name
		System.out.println("hello " + name);
		
		//print hashcode
		System.out.println(name.hashCode());
		
		//print characters
		System.out.println(name.charAt(2));
		
		//concatenate
		System.out.println(name.concat(" atole"));
	}
}
