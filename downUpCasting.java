package variablesdatatypes;

class P{
	public void show1() {
		System.out.println("In show 1 method");
	}
}
class Q extends P{
	public void show2() {
		System.out.println("In show 2 method");
	}
}
public class downUpCasting{
	public static void main(String args[]) {
		double d = 4.5;   
		int i = (int)d;    //type casting previously used
		
		System.out.println(i);
		
		//Up Casting
		P obj = new Q();   //called dynamic method dispatch previously done this program
		obj.show1();
		
		//Down Casting
		Q obj1 = (Q) obj;
		obj1.show2();
	}
}
