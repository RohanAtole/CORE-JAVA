
//String Buffer use to implementation of Immutable String

package OOPS;

public class stringBuffer{
	
	public static void main(String args[]) {
		
		//create the StringBuffer class
		StringBuffer sb = new StringBuffer("Rohan");
		
		//print the capacity
		System.out.println(sb.capacity());
		
		//print length of the String which is hold 
		System.out.println(sb.length());
		
		//append another String to the StringBuffer String
		//using the object
		System.out.println(sb.append(" Atole"));
		
		//conversion StringBuffer to String
		String str = sb.toString();
		System.out.println(str);
		
		//delete the character at specific index
		System.out.println(sb.deleteCharAt(5));
		
		//insert the String or character at specific index
		System.out.println(sb.insert(0, "hey "));
		
		//set fix length
		sb.setLength(17);
		System.out.println(sb);
	}
}
