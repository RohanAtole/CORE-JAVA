package JCF;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListProgram {
	public static void main(String args[]) {
		
		//List
		
		List<Integer> num = new ArrayList<Integer>();
		
		num.add(6);
		num.add(0);
		num.add(1);
		num.add(3);
		
		System.out.println("List : ");
		
		System.out.println("Index Of : "+ num.indexOf(0));
		System.out.println("Get Specific Number : "+ num.get(3));
		
		
		System.out.println("In element in for loop : ");
		
		for (Object n : num) {
			System.out.println(n);
		}
	}
}
