package OOPS;

public class multidimentionalArray{
	public static void main(String args[]) {
		
		int nums[][] = new int [3][4];
		//nums[0][0] = [5];
		
		//System.out.println(nums[0]);
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(nums[i][j] + "");
			}
			System.out.println();
		}
		
	}
}
