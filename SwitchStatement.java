package Variables_DataTypes;

import java.util.Scanner;


public class SwitchStatement{
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the choice:");
		
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1:
			System.out.println("you can choose case 1");
			break;
		
		case 2:
			System.out.println("you can choose case 2");
			break;
			
		case 3:
			System.out.println("you can choose case 3");
			break;
			
			default:
				System.out.println("this is default case");
				break;
		}
	}
}
