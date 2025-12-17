package variablesdatatypes;

abstract class Car{ //abstract Class
	
	//here, declared abstract method
	public abstract void drive(); //understand abstract method should work in only abstract class
	public abstract void fly();
	
	public void playMusic() {
		System.out.println("Play music");
	}
}
class WagonR extends Car{
	public void drive() { //here, defined abstract method
		System.out.println("drive wagonR Car");
	}
	
	public void fly() {
		System.out.println("car is flying");
	}
}

public class abstractKeyword{
	
	public static void main(String args[]) {
		Car obj = new WagonR();
		obj.drive();
		obj.fly();
		obj.playMusic();
	}
}
