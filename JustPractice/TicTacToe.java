import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char player = 'X';

        for (int moves = 0; moves < 9; moves++) {
            printBoard();
            System.out.println("Player " + player + " enter row and column (0-2): ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            if (board[r][c] != ' ') {
                System.out.println("Cell already filled!");
                moves--;
                continue;
            }

            board[r][c] = player;

            if (checkWin(player)) {
                printBoard();
                System.out.println("Player " + player + " wins!");
                return;
            }

            player = (player == 'X') ? 'O' : 'X';
        }

        printBoard();
        System.out.println("Match Draw!");
    }

    static void printBoard() {
        System.out.println("\nBoard:");
        for (char[] row : board) {
            System.out.println(Arrays.toString(row));
        }
    }

    static boolean checkWin(char p) {
        for (int i = 0; i < 3; i++)
            if ((board[i][0]==p && board[i][1]==p && board[i][2]==p) ||
                (board[0][i]==p && board[1][i]==p && board[2][i]==p))
                return true;

        return (board[0][0]==p && board[1][1]==p && board[2][2]==p) ||
               (board[0][2]==p && board[1][1]==p && board[2][0]==p);
    }
}
