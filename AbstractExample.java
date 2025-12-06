// Demonstration of Abstract Classes in Java

// Abstract class
abstract class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Subclass 1
class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Car is starting with a push-button start...");
    }
}

// Subclass 2
class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println("Bike is starting with a kick start...");
    }
}

// Main class
public class AbstractExample {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Royal Enfield");

        car.displayBrand();
        car.start();

        System.out.println();

        bike.displayBrand();
        bike.start();
    }
}
