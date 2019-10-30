import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SIZE = 3;
        int[][] board = new int[SIZE][SIZE];


        int numOfX = 0;
        int numOfO = 0;

        for (int i=0; i<board.length; i++) {
            for (int j=0; j<board[i].length; j++) {
                board[i][j] = in.nextInt();
            }
        }
        // not finished



    }
}