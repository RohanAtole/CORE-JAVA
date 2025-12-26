class Table {
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        Table t = new Table();

        new Thread(() -> t.printTable(5)).start();
        new Thread(() -> t.printTable(10)).start();
    }
}
