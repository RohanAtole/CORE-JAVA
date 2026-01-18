import java.util.*;

class Car {
    String number;
    long inTime;

    Car(String number) {
        this.number = number;
        this.inTime = System.currentTimeMillis();
    }
}

public class ParkingLotSystem {

    static final int CAPACITY = 5;
    static ArrayList<Car> parkedCars = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Park Car  2.Exit Car  3.View Status  4.Exit");
            System.out.print("Choose: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> parkCar();
                case 2 -> exitCar();
                case 3 -> viewStatus();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void parkCar() {
        if (parkedCars.size() >= CAPACITY) {
            System.out.println("Parking Full!");
            return;
        }
        System.out.print("Enter Car Number: ");
        String num = sc.nextLine();
        parkedCars.add(new Car(num));
        System.out.println("Car parked successfully.");
    }

    static void exitCar() {
        System.out.print("Enter Car Number: ");
        String num = sc.nextLine();

        Iterator<Car> it = parkedCars.iterator();
        while (it.hasNext()) {
            Car c = it.next();
            if (c.number.equalsIgnoreCase(num)) {
                long duration = (System.currentTimeMillis() - c.inTime) / 1000;
                double fee = duration * 2; // ₹2 per second
                it.remove();
                System.out.println("Car exited. Parking Fee: ₹" + fee);
                return;
            }
        }
        System.out.println("Car not found.");
    }

    static void viewStatus() {
        System.out.println("Parked Cars:");
        for (Car c : parkedCars)
            System.out.println(c.number);
        System.out.println("Available Slots: " + (CAPACITY - parkedCars.size()));
    }
}
