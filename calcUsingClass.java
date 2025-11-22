package OOPS;

import java.util.*;

class calc{
	
	public int add(int num1 ,int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int sub(int num1 ,int num2) {
		int result = num1 - num2;
		return result;
	}
	
	public int mul(int num1 ,int num2) {
		if(num2 == 0) {
			System.out.println("invalid input");
		}
		int result = num1 * num2;
		return result;
	}
	
	public int div(int num1 ,int num2) {
		if(num1 == 0 && num2 == 0) {
			System.out.println("invalid input");
		}
		int result = num1 / num2;
		return result;
	}
	
	public int mod(int num1 ,int num2) {
		int result = num1 % num2;
		return result;
	}
}

public class calcUsingClass{
	
	public static void main(String args[]) {
		
	calc a = new calc();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value for number1: ");
	int num1 = sc.nextInt();
	System.out.println("Enter the value for number2: ");
	int num2 = sc.nextInt();
	
	System.out.println(a.add(num1,num2));
	System.out.println(a.sub(num1,num2));
	System.out.println(a.mul(num1,num2));
	System.out.println(a.div(num1,num2));
	System.out.println(a.mod(num1,num2));
	}
}
