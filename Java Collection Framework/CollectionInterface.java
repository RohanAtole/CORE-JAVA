package JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionInterface {
	public static void main(String args[]) {
		
		//Collection
		
		Collection<Integer> nums = new ArrayList<Integer>();
		
		nums.add(3);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		for(int i : nums) {
			System.out.println(nums);
		}
		
		//List
		
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(6);
		num.add(0);
		num.add(1);
		num.add(3);
		
		System.out.println(num.indexOf(0));
		System.out.println(num.get(1));
		
	}
}
