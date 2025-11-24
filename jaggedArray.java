package OOPS;

public class jaggedArray{
	public static void main(String args[]) {
		
		int nums[][]= new int[3][];  //jagged array
		
		nums[0] = new int[3];
		nums[1] = new int[5];
		nums[2] = new int[7];
		
		//normal array
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				nums[i][j] = (int)(Math.random()*10);
				System.out.print(nums[i][j] + "");
				System.out.print(" ");
			}
			System.out.println();
		}
		
		//Enhaced array
		//here no need to get the size of array
		for(int n[] : nums) {
			for(int m : n) {
				System.out.print(m + "");
			}
			System.out.println();
		}
	}
}
