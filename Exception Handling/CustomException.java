// Step 1: Create custom exception class
class InvalidMarksException extends Exception {
    InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomException {

    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100!");
        }
        System.out.println("Valid Marks: " + marks);
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
