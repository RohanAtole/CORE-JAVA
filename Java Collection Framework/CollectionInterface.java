package JCF;

import java.util.ArrayList;

import java.util.Collection;

public class CollectionInterface {
	public static void main(String args[]) {

		Collection<Integer> nums = new ArrayList<Integer>();
		
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		for(int i : nums) {
			int num = (Integer)i;
			System.out.println(num);
		}
	}
}
