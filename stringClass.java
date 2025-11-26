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
		
		//printing sub name
		String sname = new String("Ronny");
		System.out.println("name is "+sname);
		
		String s1 = "Rohan";
		String s2 = "Rohan";
		  
		System.out.println(s1 == s1);
		
		//we can able to change address instead of data
		//because we can't change the data
		name = sname + s1;
		System.out.println(name);
	}
}
