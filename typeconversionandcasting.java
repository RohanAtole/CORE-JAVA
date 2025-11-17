package Variables_DataTypes;

public class typeconversionandcasting{
	
	public static void main(String args[]) {
		
		//type conversion
		byte b=127;
		int a=b;
		System.out.println("type conversion "+a);
		
		//type casting
		int c=12;
		byte k=(byte)c;
		System.out.println("type casting "+k);
		
		float f=5.6f;
		int t=(int)f;
		System.out.println("type casting "+t);	
		
		
		//type promotion
		byte p=10;
		byte q=30;
		int result= p*q;
		System.out.println("type promotion "+result);
	}
}
