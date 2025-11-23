package OOPS;

public class createArray{
	
	public static void main(String args[]) {
		
		//create the array 
		int num[] = {5,6,7};     //create the array
		num[2] = 8;              //replace the value
		System.out.println(num[2]);
		
		//create the array 
		int nums[] = new int[4];     //dynamic array
		nums[0] = 4;
		nums[1] = 2;
		nums[2] = 5;
		System.out.println(nums[2]);
		
		//print array elements using for loop
		for(int i = 0; i<=2; i++) {
			System.out.println(nums[i]);
		}
	}
}
