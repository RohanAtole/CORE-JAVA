import java.util.*;

class StudentRecord {
    String name;
    boolean present;

    StudentRecord(String name, boolean present) {
        this.name = name;
        this.present = present;
    }
}

public class AttendanceTracker {

    static ArrayList<StudentRecord> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n1.Mark Attendance  2.View Report  3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) markAttendance();
            else if (ch == 2) viewReport();
            else break;
        }
    }

    static void markAttendance() {
        System.out.print("Student name: ");
        String name = sc.nextLine();

        System.out.print("Present? (yes/no): ");
        String ans = sc.nextLine();

        boolean present = ans.equalsIgnoreCase("yes");
        list.add(new StudentRecord(name, present));

        System.out.println("Recorded.");
    }

    static void viewReport() {
        int presentCount = 0;

        System.out.println("\nAttendance Report:");
        for (StudentRecord s : list) {
            System.out.println(s.name + " : " + (s.present ? "Present" : "Absent"));
            if (s.present) presentCount++;
        }

        System.out.println("Total Present: " + presentCount + "/" + list.size());
    }
}
