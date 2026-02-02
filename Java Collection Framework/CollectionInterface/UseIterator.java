package JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UseIterator {
	public static void main(String args[]) {
	
		//Iterator in Sorted Set
		
				Collection<Integer> n2 = new TreeSet<Integer>();
				n2.add(3);
				n2.add(4);
				n2.add(9);
				n2.add(2);
				
				System.out.println("Sorted Set Elements :");
				
				Iterator<Integer> values = n2.iterator();
				
				while(values.hasNext())
					System.out.println(values.next());
				
				/*
				 * for (int n : n2) { System.out.println(n); }
				 */
		
	}
}
