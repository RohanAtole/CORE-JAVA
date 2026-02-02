package JCF;

import java.util.HashMap;

public class HashMapProgram {
	public static void main(String args[]) {
		
		//Map
		System.out.println("Map");
		
		Map<String, Integer> Students = new HashMap<>();
		Students.put("Navin", 56);
		Students.put("Harsh", 23);
		Students.put("Sushil", 67);
		Students.put("Kiran", 92);
		Students.put("Harsh", 45);
		
		System.out.println(Students);
		System.out.println(Students.get("Harsh"));
		
		//only print key's
		System.out.println(Students.keySet());
		
		//Print key and Values
		for (String name : Students.keySet())
		{
			System.out.println(name + " : " + Students.get(name));
		}
	}
}
