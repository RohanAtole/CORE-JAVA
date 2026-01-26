import java.util.*;

class Task implements Comparable<Task> {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }
}

public class PriorityTodoApp {

    static PriorityQueue<Task> tasks = new PriorityQueue<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Add Task  2.View Tasks  3.Complete Task  4.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1 -> addTask();
                case 2 -> viewTasks();
                case 3 -> completeTask();
                case 4 -> System.exit(0);
            }
        }
    }

    static void addTask() {
        System.out.print("Task name: ");
        String name = sc.nextLine();
        System.out.print("Priority (1=High, 5=Low): ");
        int p = sc.nextInt();

        tasks.add(new Task(name, p));
        System.out.println("Task added.");
    }

    static void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks.");
            return;
        }
        for (Task t : tasks)
            System.out.println(t.name + " (Priority " + t.priority + ")");
    }

    static void completeTask() {
        Task t = tasks.poll();
        if (t == null)
            System.out.println("No tasks to complete.");
        else
            System.out.println("Completed: " + t.name);
    }
}
