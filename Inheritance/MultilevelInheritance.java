package oops.inheritance;

class Animall{
	void eat() {
		System.out.println("Animal is Eating...");
	}
}

class mammal extends Animal{
	void walk() {
		System.out.println("walking");
	}
}

class Dogg extends mammal{
	void bark() {
		System.out.println("Barking");
	}
}

public class MultilevelInheritance{
	public static void main(String args[]) {
		Dogg obj = new Dogg();
		obj.eat();
		obj.walk();
		obj.bark();
	}
}
