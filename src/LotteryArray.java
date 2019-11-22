public class LotteryArray {
    public static void main(String[] args) {
        final int MAXROW = 10;
        int[][] odds = new int[MAXROW][];

        // Create triangular arrays
        for (int i=0; i<MAXROW; i++) {
            odds[i] = new int[i+1];
        }

        // Calculate the values of the triangular array
        for(int i=0; i<odds.length; i++) {
            for(int j=0; j<odds[i].length; j++) {
                int lotteryOdds = 1;
                for (int k=1; k<=j; k++) {
                    lotteryOdds = lotteryOdds * (i - k + 1) / k;
                }
                odds[i][j] = lotteryOdds;
            }
        }

        // print the triangular array
        for (int[] row : odds) {
            for (int element : row) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }
}
