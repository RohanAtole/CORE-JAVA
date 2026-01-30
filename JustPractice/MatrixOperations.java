import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Sum Matrix:");
        print(sum);

        System.out.println("Transpose of Sum:");
        transpose(sum);

        sc.close();
    }

    static void print(int[][] m) {
        for (int[] r : m) {
            for (int v : r) System.out.print(v + " ");
            System.out.println();
        }
    }

    static void transpose(int[][] m) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(m[j][i] + " ");
            System.out.println();
        }
    }
}
