package variablesdatatypes;

// Laptop class implicitly extends Object class
class Laptop {

    // instance variables (object state)
    String brand;
    int price;

    // toString() method → converts object into readable String
    // called automatically when object is printed
    @Override
    public String toString() {
        return brand + " : " + price;
    }

    // equals() method → compares object data (not memory address)
    @Override
    public boolean equals(Object obj) {

        // check if both references point to same object
        if (this == obj)
            return true;

        // check if passed object is null
        if (obj == null)
            return false;

        // check if both objects are of same class
        if (getClass() != obj.getClass())
            return false;

        // type casting Object to Laptop
        Laptop other = (Laptop) obj;

        // compare actual data members
        return price == other.price &&
               brand.equals(other.brand);
    }

    // hashCode() → generates integer value for object
    // must be consistent with equals()
    @Override
    public int hashCode() {
        return brand.hashCode() + price;
    }
}

public class ObjectClass {

    public static void main(String[] args) {

        // creating first Laptop object
        Laptop obj1 = new Laptop();
        obj1.brand = "Lenovo Yoga";
        obj1.price = 1000;

        // creating second Laptop object
        Laptop obj2 = new Laptop();
        obj2.brand = "Lenovo Yoga";
        obj2.price = 1000;

        // equals() checks data, not reference
        System.out.println(obj1.equals(obj2)); // true

        // toString() is called automatically
        System.out.println(obj1); // Lenovo Yoga : 1000
        System.out.println(obj2); // Lenovo Yoga : 1000
    }
}
