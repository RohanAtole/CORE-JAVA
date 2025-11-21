package Variables_DataTypes;

import java.util.Scanner;

public class forLoop{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many time iterate loop");
		int num1 = sc.nextInt();
		
		// increment
		for(int i=1; i<=num1; i++) {
			System.out.println("loop iterate : "+i);
		}
		
		System.out.println("Enter how many time iterate loop");
		int num2 = sc.nextInt();
		
		//decrement
		for(int i=num2; i>=1; i--) {
			System.out.println("loop iterate : "+i);
		}
		
	}
}
