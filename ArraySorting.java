import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9};

        Arrays.sort(arr);

        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
