package Variables_DataTypes;

import java.util.Scanner;

public class whileLoop{
	
	public static void main(String args[]) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num=1;
		
		while(num <= 5) {
			System.out.println("hello");
			num++;
		}
		System.out.println(num);
	}
}
