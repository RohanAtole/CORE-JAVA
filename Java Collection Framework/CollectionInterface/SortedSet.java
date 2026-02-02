package JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet {
	public static void main(String args[]) {
		
		//Sorted Set
		
				Set<Integer> n2 = new TreeSet<Integer>();
				n2.add(3);
				n2.add(4);
				n2.add(9);
				n2.add(2);
				
				System.out.println("Set Elements :");
				
				for (int n : n2) {
					System.out.println(n);
				}
		
	}
}
