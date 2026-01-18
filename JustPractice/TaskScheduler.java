import java.time.LocalDateTime;
import java.util.*;

class Task implements Comparable<Task> {
    String name;
    LocalDateTime time;

    Task(String name, LocalDateTime time) {
        this.name = name;
        this.time = time;
    }

    public int compareTo(Task other) {
        return this.time.compareTo(other.time);
    }
}

public class TaskScheduler {

    static PriorityQueue<Task> tasks = new PriorityQueue<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add Task  2.View Next Task  3.Execute Task  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addTask();
                case 2 -> viewNext();
                case 3 -> executeTask();
                case 4 -> System.exit(0);
            }
        }
    }

    static void addTask() {
        System.out.print("Task name: ");
        String name = sc.nextLine();

        System.out.print("Execute after minutes: ");
        int min = sc.nextInt();

        LocalDateTime time = LocalDateTime.now().plusMinutes(min);
        tasks.add(new Task(name, time));

        System.out.println("Task scheduled at " + time);
    }

    static void viewNext() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
            return;
        }
        Task t = tasks.peek();
        System.out.println("Next Task: " + t.name + " at " + t.time);
    }

    static void executeTask() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks to execute.");
            return;
        }
        Task t = tasks.poll();
        System.out.println("Executing: " + t.name);
    }
}
