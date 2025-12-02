package oops.inheritance;

class Animal1{		//Parent Class
	void eat() {
		System.out.println("Eat");
	}
}

class Dog1 extends Animal1{ 		// Child Class
	void bark() {
		System.out.println("Dog Bark");
	}
}

class Cat extends Animal1{		//Child Class
	void meow() {
		System.out.println("cat meows");
	}
}

public class HierarchicalInheritance{
	
	public static void main(String args[]) {
		Dog1 obj1 = new Dog1();  //create object first child class. 
			obj1.eat();
			obj1.bark();
			
		Cat obj2 = new Cat();	//create object second child class.
			obj2.eat();
			obj2.meow();
		
	}
}
