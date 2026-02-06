package JCF;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class StreamAPI{
	public static void main(String args[]) {
		
		List<Integer> num = Arrays.asList(4,2,3,6);
		
		int sum = 0;
		for (int n : num) {
			if(n%2==0)
			{
				n = n + 2;
				sum = sum + n;
			}
		}
		System.out.println(sum);
	}
}
