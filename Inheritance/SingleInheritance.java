package oops.inheritance;

class Animal{
	void eat() {
		System.out.println("Animal eat");
	}
}
class Dog extends Animal{  //Animal inherits Dog class
	void bark() {
		System.out.println("Dog Bark");
	}
}
public class SingleInheritance{
	public static void main(String args[]) {
		Dog obj = new Dog();  //here we only create the object of parent class.
		obj.eat();
		obj.bark();
	}
}
