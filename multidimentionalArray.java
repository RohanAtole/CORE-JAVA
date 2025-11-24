package OOPS;

public class multidimentionalArray{
	public static void main(String args[]) {
		
		int nums[][] = new int [3][4];
		
		//get random elements
		System.out.println("pick random variables\n");
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				nums[i][j] =  (int)(Math.random() * 10);
				System.out.print(nums[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("\nAccessing the elements\n");
		//Accessing elements
		int num[][] = new int [3][4];
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(num[i][j] + "");
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
	}
}
