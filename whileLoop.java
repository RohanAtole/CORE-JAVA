package Variables_DataTypes;

import java.util.Scanner;

public class whileLoop{
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);

		int num=1;
		
		while(num <= 5) {
			System.out.println("hello : " + num);
			int j = 1;
			while(j <= 3) {
				System.out.println("hii everyone : " + j);
				j++;
			}
			num++;
		}
		System.out.println(num);
	}
}
