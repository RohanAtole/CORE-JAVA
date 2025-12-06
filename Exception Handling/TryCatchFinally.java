public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Error: Null value encountered!");
        } finally {
            System.out.println("Finally block always runs!");
        }
    }
}
