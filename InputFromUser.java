package variablesdatatypes;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
 
public class InputFromUser{
	public static void main(String a[]) throws IOException{
		System.out.println("Enter the number :");
		
		
		 InputStreamReader in = new InputStreamReader(System.in);
		 BufferedReader bf = new BufferedReader(in);
		  
		 int num = Integer.parseInt(bf.readLine()); 
		 System.out.println(num);
		 bf.close();	
	}
}
