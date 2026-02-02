package JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListProgram {
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
	}
}
