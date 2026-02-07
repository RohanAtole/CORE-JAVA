package JCF;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.Collection;


public class StreamAPI{
	public static void main(String args[]) {
		
		List<Integer> num = Arrays.asList(4,2,3,6,5,6);
		
		//This multiple liner
		Stream<Integer> s1 = num.stream();
		
		Stream<Integer> s2 = s1.filter(n -> n%2==0);
		
		Stream<Integer> s3 = s2.map(n -> n+2);
		
		int result = s3.reduce(0, (c,e) -> c+e);
		
		System.out.println(result);
		
		//One liner
		int res = num.stream()
			.filter(n -> n%2==0)
			.map(n -> n+2)
			.reduce(0, (c,e) -> c+e);
		
		System.out.println(res);
		//s3.forEach(n -> System.out.println(n));
	}
}
