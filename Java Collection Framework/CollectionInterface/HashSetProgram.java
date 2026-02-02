package JCF;

import java.util.HashSet;

public class HashSetProgram {
	public static void main(String args[]) {
	
		//Set
		
		Set<Integer> n1 = new HashSet<Integer>();
		n1.add(3);
		n1.add(4);
		n1.add(9);
		n1.add(2);
		
		System.out.println("Set Elements :");
		
		for (int n : n1) {
			System.out.println(n);
		}
	}
}
